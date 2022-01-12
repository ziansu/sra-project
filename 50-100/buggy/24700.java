@java.lang.Override
public void onNext(io.relayr.java.model.channel.DataChannel channel) {
    channelCreation.remove(deviceId);
    if (!(pubObservers.containsKey(deviceId)))
        pubObservers.put(deviceId, subject);
    
    if (!(pubChannels.containsKey(deviceId)))
        pubChannels.put(deviceId, channel);
    
    publishData(deviceId, payload, subject);
}