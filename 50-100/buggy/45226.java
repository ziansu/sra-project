@java.lang.Override
@java.lang.Deprecated
public com.metabroadcast.common.base.Maybe<org.atlasapi.media.channel.Channel> fromKey(java.lang.String key) {
    for (org.atlasapi.media.channel.Channel channel : channels.get()) {
        if ((java.util.Objects.nonNull(channel.getKey())) && (channel.getKey().equals(key))) {
            return com.metabroadcast.common.base.Maybe.just(channel);
        }
    }
    return com.metabroadcast.common.base.Maybe.nothing();
}