@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.bundles_fragment, null);
    model = com.inaetics.demonstrator.model.Model.getInstance();
    model.addObserver(this);
    adapter = new com.inaetics.demonstrator.controller.BundleItemAdapter(getActivity().getBaseContext(), R.layout.bundle_item, model.getBundles(), model);
    android.widget.ListView bundleList = ((android.widget.ListView) (rootView.findViewById(R.id.bundles_listview)));
    bundleList.setAdapter(adapter);
    return rootView;
}