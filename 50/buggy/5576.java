@java.lang.Override
public io.netty.channel.ChannelHandler call(final io.netty.channel.ChannelPipeline pipeline) {
    return org.jocean.http.client.OutboundFeature.PROGRESSIVE.applyTo(pipeline, _responseSubscriber, this._minIntervalInMs);
}