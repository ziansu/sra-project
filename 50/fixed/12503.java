@java.lang.Override
public void onClick(android.view.View view) {
    if ((onChannelInfoItemSelectedListener) != null) {
        onChannelInfoItemSelectedListener.selected(info.serviceId, info.getLink(), info.channelName);
    }
}