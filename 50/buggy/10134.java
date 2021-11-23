@java.lang.Override
public boolean execute() {
    reload();
    if ((org.bbop.apollo.gwt.client.TrackPanel.trackInfoList.size()) == 0) {
        return true;
    }
    return false;
}