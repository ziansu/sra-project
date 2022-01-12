@java.lang.Override
public java.lang.Integer call(final java.lang.String name, final io.netty.channel.ChannelHandler handler) {
    if (handler instanceof org.jocean.idiom.Ordered) {
        return ((org.jocean.idiom.Ordered) (handler)).ordinal();
    }else {
        try {
            return java.lang.Enum.valueOf(cls, name).ordinal();
        } catch (java.lang.IllegalArgumentException e) {
            org.jocean.http.util.Nettys.LOG.warn("No enum constant {}.{}", cls.getCanonicalName(), name);
            return java.lang.Integer.MIN_VALUE;
        }
    }
}