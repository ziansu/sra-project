@java.lang.Override
public void onItemClick(int position) {
    if (((breadcrumbScrollView) != null) && ((breadcrumbToolbarListener) != null)) {
        for (int i = toolbarItemStack.size(); i > position; i--) {
            toolbarItemStack.pop();
            breadcrumbToolbarListener.onBreadcrumbToolbarItemPop(toolbarItemStack.size());
        }
        breadcrumbScrollView.removeBreadcrumbItemFrom(position);
    }
}