@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    inflateView(inflater, container);
    disableScreenRotation();
    initDisplay();
    initWeekDays();
    initOnClick();
    refresh();
    setWindowSize();
    return layout;
}