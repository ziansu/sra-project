@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof pl.grzeslowski.jsupla.server.entities.requests.ChannelNewValueResultRequest)) {
        return false;
    }
    pl.grzeslowski.jsupla.server.entities.requests.ChannelNewValueResultRequest that = ((pl.grzeslowski.jsupla.server.entities.requests.ChannelNewValueResultRequest) (o));
    return (((channelNumber) == (that.channelNumber)) && ((senderId) == (that.senderId))) && ((success) == (that.success));
}