@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_train_listing, container, false);
    this.trainTable = ((android.widget.TableLayout) (rootView.findViewById(R.id.trainTable)));
    return rootView;
}