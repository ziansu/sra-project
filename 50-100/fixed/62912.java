@java.lang.Override
public void onPause() {
    it.unipd.dei.esp1415.CurrentSessionDetailsActivity.sDb.open();
    android.support.v4.content.LocalBroadcastManager.getInstance(this.getActivity()).unregisterReceiver(mAccelerationReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(this.getActivity()).unregisterReceiver(mDurationReceiver);
    it.unipd.dei.esp1415.CurrentSessionDetailsActivity.sCurrentSession.setName(mSessionName.getText().toString());
    it.unipd.dei.esp1415.CurrentSessionDetailsActivity.sDb.renameSession(it.unipd.dei.esp1415.CurrentSessionDetailsActivity.sCurrentSession);
    it.unipd.dei.esp1415.CurrentSessionDetailsActivity.sDb.close();
    sEditor.putBoolean("CurrentSessionOnBackground", true);
    sEditor.commit();
    super.onPause();
}