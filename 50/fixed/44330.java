protected void setItemList(@android.support.annotation.NonNull
java.util.ArrayList<T> itemList) {
    this.itemList = itemList;
    org.bbt.kiakoa.tools.ListItemClickRecyclerAdapter.notifyDataSetChanged();
}