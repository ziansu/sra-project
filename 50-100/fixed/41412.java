@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_managing_existing_products, container, false);
    productDAO = new com.lidchanin.crudindiploma.data.dao.ProductDAO(getContext());
    productDAO.open();
    initializeData();
    initializeRecyclerView(view);
    initializeAdapter();
    return view;
}