@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof pl.grzeslowski.jsupla.server.entities.requests.ChannelNewValueResultRequest))
        return false;
    
    pl.grzeslowski.jsupla.server.entities.requests.ChannelNewValueResultRequest that = ((pl.grzeslowski.jsupla.server.entities.requests.ChannelNewValueResultRequest) (o));
    if ((channelNumber) != (that.channelNumber))
        return false;
    
    if ((senderId) != (that.senderId))
        return false;
    
    return (success) == (that.success);
}