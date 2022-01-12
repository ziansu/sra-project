@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    inflateView(inflater, container);
    if ((savedInstanceState != null) && (savedInstanceState.containsKey(org.commcare.views.widgets.CalendarFragment.TIME))) {
        calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(savedInstanceState.getLong(org.commcare.views.widgets.CalendarFragment.TIME));
    }
    disableScreenRotation();
    initDisplay();
    initWeekDays();
    initOnClick();
    refresh();
    setWindowSize();
    return layout;
}