private boolean isAnimating(int position) {
    if (position == 0)
        return false;
    
    do {
        position--;
        com.blunderer.materialdesignlibrary.models.ListItem item = getItem(position);
        if (item instanceof com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemCollapsibleHeader) {
            return ((com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemCollapsibleHeader) (item)).isAnimating();
        }else
            if (item instanceof com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemHeader) {
                break;
            }
        
    } while (position > 0 );
    return false;
}