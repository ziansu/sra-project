@java.lang.Override
public net.minecraftforge.fml.common.network.simpleimpl.IMessage onMessage(coolsquid.react.network.PacketConfig message, net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    if ((net.minecraftforge.fml.common.FMLCommonHandler.instance().getSide()) == (net.minecraftforge.fml.relauncher.Side.CLIENT)) {
        coolsquid.react.ConfigManager.load(com.typesafe.config.ConfigFactory.parseString(new java.lang.String(message.config)));
        coolsquid.react.network.PacketConfig.Handler.hasServerConfigs = true;
    }
    return null;
}