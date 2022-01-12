@java.lang.Override
protected android.view.View onCreateView(android.view.ViewGroup parent) {
    android.view.View view = super.onCreateView(parent);
    android.view.ViewGroup stub = ((android.view.ViewGroup) (view.findViewById(R.id.stub)));
    stub.removeAllViews();
    android.view.LayoutInflater.from(getContext()).inflate(R.layout.widget_radio, stub, true);
    return view;
}