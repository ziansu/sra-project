@java.lang.Override
public java.lang.Integer call(final java.lang.String name, final io.netty.channel.ChannelHandler handler) {
    if (handler instanceof org.jocean.idiom.Ordered) {
        return ((org.jocean.idiom.Ordered) (handler)).ordinal();
    }else {
        return java.lang.Enum.valueOf(cls, name).ordinal();
    }
}