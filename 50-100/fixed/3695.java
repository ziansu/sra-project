@android.support.annotation.Nullable
private org.dvbviewer.controller.entities.Channel getMatchedChannel(@android.support.annotation.Nullable
java.util.List<org.dvbviewer.controller.entities.ChannelRoot> channelRoots, long favId) {
    if (channelRoots != null) {
        for (org.dvbviewer.controller.entities.ChannelRoot roots : channelRoots) {
            for (org.dvbviewer.controller.entities.ChannelGroup group : roots.getGroups()) {
                for (org.dvbviewer.controller.entities.Channel chan : group.getChannels()) {
                    if ((chan.getChannelID()) == favId) {
                        return chan;
                    }
                }
            }
        }
    }
    return null;
}