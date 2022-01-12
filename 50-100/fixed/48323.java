@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_game, container, false);
    wireUpViews(rootView);
    startCountDown(rootView);
    prepareEditText(rootView);
    prepareInitialWord();
    return rootView;
}