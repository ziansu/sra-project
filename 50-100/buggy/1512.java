@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        java.lang.String itemId = listItem.getObjectId();
        com.example.shopply.shopplynewapp.DataObjectItem item = new com.example.shopply.shopplynewapp.DataObjectItem(listItem.getObjectId(), s, itemCategoryColor, value, (!checked ? 0 : 1));
        ((com.example.shopply.shopplynewapp.adapters.MyRecyclerViewItemListAdapter) (mAdapterItem)).addItem(item, ((itemIndex)++));
    }else {
        android.util.Log.i(com.example.shopply.shopplynewapp.activities.ItemListCardView.TAG, ("save new item failed, error = " + (e.getMessage())));
    }
}