public void changeQuantity(final int position, double newValue) {
    datx021512.chalmers.se.greenme.adapters.ShopItem temp = mListData.get(position);
    temp.setQuantity(((temp.getQuantity()) + 1));
    mListData.remove(position);
    mListData.add(position, temp);
    notifyDataSetChanged();
    updateTotalImpact(position);
}