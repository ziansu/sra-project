private int itemVisibility(int position) {
    do {
        position--;
        com.blunderer.materialdesignlibrary.models.ListItem item = getItem(position);
        if (item instanceof com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemCollapsibleHeader) {
            return ((com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemCollapsibleHeader) (item)).getVisibility();
        }else
            if (item instanceof com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemHeader) {
                break;
            }
        
    } while (position >= 0 );
    return android.view.View.VISIBLE;
}