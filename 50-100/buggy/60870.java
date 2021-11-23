@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> arg0, android.view.View view, int position, long arg3) {
    if ((mDrawerCategoriesList.getAdapter()) != null) {
        java.lang.Object item = mDrawerCategoriesList.getAdapter().getItem(position);
        if (item != null) {
            mActivity.editCategory(((net.fred.taskgame.model.Category) (item)));
        }
    }else {
        net.fred.taskgame.utils.UiUtils.showMessage(getActivity(), R.string.category_deleted);
    }
    return true;
}