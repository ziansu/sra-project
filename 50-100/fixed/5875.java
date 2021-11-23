@java.lang.Override
public void onItemClick(int position) {
    if (((breadcrumbScrollView) != null) && ((breadcrumbToolbarListener) != null)) {
        for (int i = toolbarItemStack.size(); i > position; i--) {
            breadcrumbToolbarListener.onBreadcrumbToolbarItemPop((i - 1));
        }
    }
}