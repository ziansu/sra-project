@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    shoppingListId = getArguments().getLong(Constants.Bundles.SHOPPING_LIST_ID);
    shoppingListDAO = new com.lidchanin.crudindiploma.data.dao.ShoppingListDAO(getActivity());
    productDAO = new com.lidchanin.crudindiploma.data.dao.ProductDAO(getActivity());
    existingProductDAO = new com.lidchanin.crudindiploma.data.dao.ExistingProductDAO(getActivity());
    initializeData(shoppingListId);
}