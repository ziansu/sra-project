@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.i(com.example.myapplication.ui.fragment.manager.PackageManagerFragment.TAG, "onDestroy: ");
    if ((actionMode) != null) {
        actionMode.finish();
        actionMode = null;
    }
}