public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_main, container, false);
    initViews(view);
    setupAnimations();
    setupListeners(view);
    initDb();
    setQuote();
    initializeInstanceVariables();
    startAnimations();
    return view;
}