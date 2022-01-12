@java.lang.Override
public void onJoin(org.dclayer.application.networktypeslotmap.NetworkEndpointSlot networkEndpointSlot, org.dclayer.net.Data ownAddressData) {
    for (org.dclayer.net.Data partner : org.sblit.configuration.Configuration.getReceivers()) {
        org.sblit.configuration.Configuration.getApp().requestApplicationChannel(networkEndpointSlot, Sblit.APPLICATION_IDENTIFIER, org.sblit.converter.Converter.dataToKey(partner), new org.sblit.filesync.ApplicationChannelActionListener(this));
    }
}