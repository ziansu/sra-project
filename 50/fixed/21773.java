@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.user_registration);
    butterknife.ButterKnife.bind(this);
    timber.log.Timber.v("Registration OnCreate");
}