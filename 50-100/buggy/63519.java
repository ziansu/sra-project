@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    butterknife.ButterKnife.bind(this, view);
    if (savedInstanceState != null) {
        state = savedInstanceState;
    }
    getContextIfNull();
    getInternalSettings();
    getStateFromPrefs();
    configureMapFragment();
    gpsStatusListener(com.example.aprokopenko.triphelper.ui.fragment.MainFragment.REGISTER);
    setupButtons();
    setupSpeedometer();
    setupTripProcessor();
    setupFuelFields();
}