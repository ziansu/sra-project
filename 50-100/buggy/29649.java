public void delete_item(android.view.View view) {
    java.lang.Object tag = ((android.view.ViewGroup) (view.getParent())).getTag();
    if (tag != null) {
        java.lang.String itemId = tag.toString();
        new com.comp4350.listassist.business.ItemAPIHelper(this).execute("delete", itemId);
        com.comp4350.listassist.presentation.ViewActivity.refresh_items();
    }else {
        android.util.Log.e("ViewActivity", "Failure to get id for deleting item");
    }
}