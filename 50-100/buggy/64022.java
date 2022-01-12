private void setupLockScreenAndService() {
    android.util.Log.d(app.lock.bluetooth.smart_lock_app.LockListScreen.TAG, "setupLockScreenAndService()");
    mLockArrayAdapter = new eecs398_lock.LocksAdapter(this, new java.util.ArrayList<eecs398_lock.SmartLock>(lockManager.getLocks().values()));
    android.widget.GridView mLockView = ((android.widget.GridView) (findViewById(R.id.gridView)));
    mLockView.setAdapter(mLockArrayAdapter);
    android.util.Log.e(app.lock.bluetooth.smart_lock_app.LockListScreen.TAG, ((mLockArrayAdapter.getCount()) + ""));
    mLockService = new eecs398_lock.BluetoothLockService(this, mHandler);
}