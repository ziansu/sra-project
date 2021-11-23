public void removeItem(com.brothers.travelplanner.activities.priceplan.cart.CartDataModel item) {
    for (int index = 0; index < (cartDataModelList.size()); index++) {
        if (((cartDataModelList.get(index).index) == (item.index)) && ((cartDataModelList.get(index).getId()) == (item.getId()))) {
            cartDataModelList.remove(index);
        }
    }
    notifyDataSetChanged();
}