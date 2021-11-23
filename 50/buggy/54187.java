@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    mLastLocation = getIntent().getParcelableExtra(com.ddup4.autonav.module.main.MainActivity.EXTRA_LAST_LOCATION);
    super.onCreate(savedInstanceState, persistentState);
}