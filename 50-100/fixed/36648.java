@java.lang.Override
public void onRecordChanged(com.ckt.io.wifidirect.provider.Record record, int state_old, int state_new) {
    if ((state_new == (com.ckt.io.wifidirect.provider.Record.STATE_FINISHED)) && ((getContext()) != null)) {
        drawLoader.load(getContext(), record.getPath());
    }
    updateExpandableListView();
    com.ckt.io.wifidirect.utils.LogUtils.i(WifiP2pHelper.TAG, "onRecordChanged");
}