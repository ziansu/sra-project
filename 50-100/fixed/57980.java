@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.schedule_fragment_main, container, false);
    unbinder = butterknife.ButterKnife.bind(this, rootView);
    readSavedSelectedDateString(savedInstanceState);
    initPager();
    initLoader();
    updateCurrentWeekDatesForSelectedDate();
    return rootView;
}