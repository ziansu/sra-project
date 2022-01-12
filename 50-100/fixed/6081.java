@java.lang.Override
public void execute(net.minecraft.command.ICommandSender icommandsender, java.lang.String[] astring) {
    if ((astring.length) == 0) {
        return ;
    }
    if (icommandsender instanceof net.minecraft.entity.player.EntityPlayerMP) {
        net.minecraft.entity.player.EntityPlayerMP player = ((net.minecraft.entity.player.EntityPlayerMP) (icommandsender));
        com.gildedgames.util.testutil.instances.DefaultHandler handler = com.gildedgames.util.testutil.TestCore.locate().getHandler();
        com.gildedgames.util.testutil.instances.DefaultInstance inst = handler.get(astring[0]);
        handler.teleportToInst(player, inst);
    }
}