@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_supplier_deals_list, container, false);
    dealsRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.supplier_deals_List)));
    dealsRecyclerView.setHasFixedSize(true);
    final android.support.v7.widget.RecyclerView.LayoutManager dealsLayoutManager = new android.support.v7.widget.LinearLayoutManager(getContext());
    dealsRecyclerView.setLayoutManager(dealsLayoutManager);
    getActivity().getSupportLoaderManager().initLoader(com.zaks.ayala.nearbydeals.ui.SupplierDealsListFragment.DealsLoaderId, null, this);
    getSupplier();
    return view;
}