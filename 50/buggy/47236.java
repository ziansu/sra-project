private void increment() {
    android.util.Log.d("gemtest", "increment");
    if ((mListener) != null) {
        mListener.onRepeatUpdaterEvent(gemstone.gemster.RepeatUpdater.EventMode.EVENT_INCREMENT, null);
    }
}