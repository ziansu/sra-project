@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_available, container, false);
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
    setupUpdateIconsText(view);
    setupChangelog(view, activity);
    return view;
}