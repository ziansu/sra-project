@java.lang.Override
public void onResume() {
    super.onResume();
    setUpHeader();
    setHariini();
    setNotifHarian();
    bonusGiver();
    android.util.Log.d("resem", "onResume: ");
}