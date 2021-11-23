@java.lang.Override
public void onBackKey() {
    com.example.kbpark.frontbeaconmonitor.LoginMain activity = ((com.example.kbpark.frontbeaconmonitor.LoginMain) (getActivity()));
    activity.setOnKeyBackPressedListener(null);
    activity.onBackPressed();
}