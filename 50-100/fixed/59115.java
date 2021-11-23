public void changeQuantity(final int position, double newValue) {
    datx021512.chalmers.se.greenme.adapters.ShopItem temp = mListData.get(position);
    temp.setQuantity(newValue);
    mListData.remove(position);
    mListData.add(position, temp);
    notifyDataSetChanged();
    updateTotalImpact(position);
}