public static com.jabbar.shoppinglist.ui.activeLists.AddListItemDialogFragment newInstance(java.lang.String parentKey, int layoutRes, int positiveStringResource, int hintResource) {
    com.jabbar.shoppinglist.ui.activeLists.AddListItemDialogFragment fragment = new com.jabbar.shoppinglist.ui.activeLists.AddListItemDialogFragment();
    android.os.Bundle bundle = getBundleWithResource(layoutRes, positiveStringResource, hintResource);
    bundle.putString(Constants.KEY_CURRENT_LIST_PUSH_ID, parentKey);
    fragment.setArguments(getBundleWithResource(layoutRes, positiveStringResource, hintResource));
    return fragment;
}