public void restoreChannelsFromProfile() {
    channelTableModel_.setChannels(org.micromanager.micronuclei.internal.data.ChannelInfo.restoreChannelsFromProfile(userProfile_, this.getClass(), org.micromanager.micronuclei.internal.gui.ChannelPanel.CHANNELDATA));
}