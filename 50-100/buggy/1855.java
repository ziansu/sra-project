@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup parent, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, parent, savedInstanceState);
    android.view.View v = inflater.inflate(R.layout.fragment_residence, parent, false);
    org.wit.myrent.activities.ResidenceActivity residenceActivity = ((org.wit.myrent.activities.ResidenceActivity) (getActivity()));
    residenceActivity.actionBar.setDisplayHomeAsUpEnabled(true);
    addListeners(v);
    updateControls(residence);
    return v;
}