@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    context = getActivity();
    tripProcessor = new com.example.aprokopenko.triphelper.TripProcessor(context);
    butterknife.ButterKnife.bind(this, view);
    registerGpsStatusListener();
    setupLocationService();
    setupSpeedometer();
    if (savedInstanceState != null) {
        restoreState(savedInstanceState);
        state = savedInstanceState;
    }
}