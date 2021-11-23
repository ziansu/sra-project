@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle bundle = getArguments();
    product_ID = bundle.getInt("prod_id");
    productName = bundle.getString("prod_name");
    groceryList_ID = bundle.getInt("gl_id");
    groceryManager = new com.example.myfirstapp.mgr.GroceryManager(getContext());
}