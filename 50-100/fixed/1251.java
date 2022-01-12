public void unCheckAll(boolean animate) {
    for (int index = 0; index < (getItemCount()); index++) {
        if (isChecked(index)) {
            tracker.setStateFor(index, (animate ? StateTracker.EXIT : StateTracker.DEFAULT));
            notifyItemChanged(index);
        }
    }
    if (mode.isActivated()) {
        android.util.Log.d(com.vpaliy.multiplechoice.BaseAdapter.TAG, ("After canceling:" + (java.lang.Integer.toString(tracker.getCheckedItemCount()))));
        mode.turnOff();
    }
}