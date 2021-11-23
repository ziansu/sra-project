@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((view) == null)
        view = inflater.inflate(R.layout.opinions_fragment, container, false);
    
    initializeUI(view);
    return view;
}