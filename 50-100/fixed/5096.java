@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cart);
    customerId = 28;
    list = ((android.widget.ListView) (findViewById(R.id.listView)));
    bookList = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>();
    getCartData(customerId);
}