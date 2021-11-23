@java.lang.Override
public net.minecraft.item.ItemStack onItemRightClick(net.minecraft.item.ItemStack stack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player) {
    cn.academy.terminal.TerminalData tData = cn.academy.terminal.TerminalData.get(player);
    if (tData.isTerminalInstalled()) {
        if (!(world.isRemote))
            player.addChatMessage(new net.minecraft.util.ChatComponentTranslation("ac.terminal.alrdy_installed"));
        
    }else {
        if (!(world.isRemote)) {
            if (!(player.capabilities.isCreativeMode))
                (stack.stackSize)--;
            
            tData.install();
            cn.academy.terminal.item.ItemTerminalInstaller.startInstalling();
        }
    }
    return stack;
}