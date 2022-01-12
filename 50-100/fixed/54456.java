@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup parentViewGroup, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_list, parentViewGroup, false);
    if (savedInstanceState != null) {
        model = new com.modelingbrain.home.db.DBHelperModel(getActivity().getBaseContext()).openModel(savedInstanceState.getInt(modelID));
    }
    initColors();
    return rootView;
}