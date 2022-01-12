@java.lang.Override
protected android.view.View onCreateView(android.view.ViewGroup parent) {
    android.view.View view = super.onCreateView(parent);
    android.view.ViewGroup stub = ((android.view.ViewGroup) (view.findViewById(R.id.stub)));
    stub.removeAllViews();
    android.view.LayoutInflater.from(getContext()).inflate(R.layout.widget_radio, stub, true);
    view.setPadding(com.majeur.preferencekit.Utils.dpToPx(getContext(), 20), 0, 0, 0);
    return view;
}