@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_about, container, false);
    initializeViews(v);
    initilizeLocations();
    initGoogleMaps();
    setDialNumberListener(phoneDCTextView, "6503018434");
    setDialNumberListener(phoneAdultTextView, "6503018434");
    setDialNumberListener(phoneBelmontTextView, "6508026534");
    setDialNumberListener(phoneRedwoodTextView, "6508026534");
    return v;
}