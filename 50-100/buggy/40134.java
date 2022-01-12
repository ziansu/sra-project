@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.addProduct)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.facu.market.AddProduct.AddProductActivity.class);
        intent.putExtra("2", productBuyeds);
        startActivityForResult(intent, 1);
    }
    if ((v.getId()) == (deleteIcon.getId())) {
        deteleProduct();
        calculateTotal();
        normalModeToolbar();
    }
}