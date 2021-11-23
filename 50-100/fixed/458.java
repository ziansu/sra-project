@org.jetbrains.annotations.NotNull
public static boolean isPlayerOpped(@org.jetbrains.annotations.NotNull
final net.minecraft.command.ICommandSender sender) {
    if (sender instanceof net.minecraft.entity.player.EntityPlayer) {
        return net.minecraftforge.fml.common.FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().canSendCommands(((net.minecraft.entity.player.EntityPlayer) (sender)).getGameProfile());
    }
    return true;
}