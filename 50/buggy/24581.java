@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mSubscription.setShowListened(isChecked);
    OnSwitchChangedHandler(isChecked, contentResolver, mHideListenedListener);
}