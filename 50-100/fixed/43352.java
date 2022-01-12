@java.lang.Override
public void run() {
    ChanceCubeRegistry.INSTANCE.registerReward(this);
    net.minecraft.entity.player.EntityPlayer player = net.minecraftforge.fml.common.FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayerByUUID(uuid);
    if (player != null) {
        player.addChatMessage(new net.minecraft.util.text.TextComponentString((("Seems you have some custom Chance Cubes rewards " + (userName)) + "....")));
        player.addChatMessage(new net.minecraft.util.text.TextComponentString("Let the fun begin! >:)"));
    }
}