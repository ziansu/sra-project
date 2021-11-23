@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i(com.codecool.android.neightbrotaxi.view.MainActivity.TAG, "ACTIVITY RESUMED!");
    storageController.getStoredUser();
    getProfile();
}