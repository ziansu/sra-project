@java.lang.Override
public void onProductAvailable(com.example.marni.orderapp.Domain.Product product) {
    products.add(product);
    mAdapter.notifyDataSetChanged();
}