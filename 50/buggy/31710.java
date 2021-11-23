@java.lang.Override
public void onCancelClickedListener() {
    imageButtonStatus.setSelected(false);
    long spendTime = timeWatchDialog.stop();
    android.util.Log.d("TTT", ("onCancelClickedListener: " + spendTime));
}