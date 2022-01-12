@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.fragment_main, container, false);
    initTabs();
    if (getActivity().getIntent().hasExtra("stopName")) {
        setTabAndSpinner();
    }
    currentTab = tabHost.getCurrentTabTag();
    autoReloadStopForecast(15000, 15000);
    return rootView;
}