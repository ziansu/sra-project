@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootLayout = inflater.inflate(R.layout.fragment_cht_identity_create, container, false);
    initViews(rootLayout);
    getActivity().getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
    return rootLayout;
}