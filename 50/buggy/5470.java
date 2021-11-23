public void changeList(java.util.List<com.example.miljanrakita.shoppingapplication.Model.Product> list) {
    mProductList = list;
    mProductList.add(new com.example.miljanrakita.shoppingapplication.Model.Product(com.example.miljanrakita.shoppingapplication.Util.Constants.ADD_BUTTON, 0.0F, null, 0.0F, null, null));
    notifyDataSetChanged();
}