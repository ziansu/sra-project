@java.lang.Override
public java.util.List<org.jivesoftware.openfire.mix.mam.ArchivedMixChannelMessage> execute() {
    if ((end) != null) {
        if ((limit) == 0) {
            return repository.findTimeBoundMessagesByChannel(channelName, start, end);
        }else {
            return repository.findLimitedTimeBoundMessagesByChannel(channelName, start, end, limit);
        }
    }else {
        if ((limit) == 0) {
            return repository.findMessagesByChannelSince(channelName, start);
        }else {
            return repository.findLimitedMessagesByChannelSince(channelName, start, limit);
        }
    }
}