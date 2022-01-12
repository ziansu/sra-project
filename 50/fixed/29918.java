@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    lock.toggleLock(((app.lock.bluetooth.smart_lock_app.LockListScreen) (mContext)));
}