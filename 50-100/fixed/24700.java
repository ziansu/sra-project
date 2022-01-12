@java.lang.Override
public void onNext(io.relayr.java.model.channel.DataChannel channel) {
    if (!(pubObservers.containsKey(deviceId)))
        pubObservers.put(deviceId, subject);
    
    if (!(pubChannels.containsKey(deviceId)))
        pubChannels.put(deviceId, channel);
    
    channelCreation.remove(deviceId);
    publishData(deviceId, payload, subject);
}