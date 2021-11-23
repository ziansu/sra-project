public static void showDialog(android.support.v4.app.FragmentActivity activity, int title, int min, int max, int startCurrent, int endCurrent, ch.poole.openinghoursfragment.SetRangeListener listener) {
    ch.poole.openinghoursfragment.RangePicker.dismissDialog(activity);
    android.support.v4.app.FragmentManager fm = activity.getSupportFragmentManager();
    ch.poole.openinghoursfragment.RangePicker rangePickerFragment = ch.poole.openinghoursfragment.RangePicker.newInstance(title, min, max, startCurrent, endCurrent, listener);
    if (rangePickerFragment != null) {
        rangePickerFragment.show(fm, ch.poole.openinghoursfragment.RangePicker.TAG);
    }else {
        android.util.Log.e(ch.poole.openinghoursfragment.RangePicker.DEBUG_TAG, "Unable to create range picker dialog ");
    }
}