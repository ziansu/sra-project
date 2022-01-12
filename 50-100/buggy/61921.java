@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    int numberOfCharacter = getArguments().getInt(getString(R.string.bundle_key_number_of_character), 1);
    android.view.View rootView = inflater.inflate(R.layout.activity_auto_fit_recycler_view, container, false);
    android.content.Intent intent = getActivity().getIntent();
    com.example.dotua.goldendictbridge.SharedFunction.executeFragmentWordIntent(getActivity(), intent, rootView, numberOfCharacter);
    return rootView;
}