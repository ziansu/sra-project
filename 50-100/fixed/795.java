@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    if ((view) == null) {
        view = inflater.inflate(R.layout.fragment_about, container, false);
    }
    initGoogleMaps();
    initializeViews(view);
    initilizeLocations();
    setDialNumberListener(phoneDCTextView, "6503018434");
    setDialNumberListener(phoneAdultTextView, "6503018434");
    setDialNumberListener(phoneBelmontTextView, "6508026534");
    setDialNumberListener(phoneRedwoodTextView, "6508026534");
    return view;
}