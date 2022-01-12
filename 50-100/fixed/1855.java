@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup parent, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, parent, savedInstanceState);
    android.view.View v = inflater.inflate(R.layout.fragment_residence, parent, false);
    addListeners(v);
    updateControls(residence);
    return v;
}