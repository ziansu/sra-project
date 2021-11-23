@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    butterknife.ButterKnife.bind(this);
    setContentView(R.layout.user_registration);
    timber.log.Timber.v("Registration OnCreate");
}