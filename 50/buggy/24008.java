@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    android.util.Log.i(com.wolkabout.hexiwear.activity.Tracking.TAG, "in on restore");
    button_tracking.setText(savedInstanceState.getString("btn_text"));
}