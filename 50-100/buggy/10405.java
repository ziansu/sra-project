@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View loadedFragment = inflater.inflate(R.layout.fragment_manage_group_products, container, false);
    initializeWidgets(loadedFragment);
    setupToolbar();
    setupAddProductButtonListener(loadedFragment);
    setupActionModeCallback();
    setupRecyclerView();
    populateProductList();
    return loadedFragment;
}