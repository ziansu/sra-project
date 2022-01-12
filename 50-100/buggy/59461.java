@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    updateUI();
    if (resultCode != (android.app.Activity.RESULT_OK)) {
        return ;
    }
    switch (requestCode) {
        case com.csci448.freshapps.keepitfresh.ItemListFragment.REQUEST_OPTION :
            mSortOption = ((com.csci448.freshapps.keepitfresh.SortOptions) (data.getSerializableExtra(SortOptionsDialogFragment.EXTRA_SORT_OPTION)));
            updateUI();
            break;
        case com.csci448.freshapps.keepitfresh.ItemListFragment.REQUEST_NEW_ITEM :
            updateUI();
            break;
        case com.csci448.freshapps.keepitfresh.ItemListFragment.REQUEST_ITEM_DETAIL :
            updateUI();
        default :
            updateUI();
            break;
    }
}