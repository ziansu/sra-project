@java.lang.Override
public void execute(net.minecraft.command.ICommandSender icommandsender, java.lang.String[] astring) {
    if (icommandsender instanceof net.minecraft.entity.player.EntityPlayerMP) {
        net.minecraft.entity.player.EntityPlayerMP player = ((net.minecraft.entity.player.EntityPlayerMP) (icommandsender));
        com.gildedgames.util.testutil.instances.DefaultHandler handler = com.gildedgames.util.testutil.TestCore.locate().getHandler();
        handler.teleportBack(player);
    }
}