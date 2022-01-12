public android.view.ViewGroup listItemParent(android.view.View view) {
    if ((view.getId()) == (R.id.list_item_parent)) {
        return ((android.view.ViewGroup) (view));
    }
    android.view.ViewGroup vg = ((android.view.ViewGroup) (view.getParent()));
    while ((vg.getId()) != (R.id.list_item_parent)) {
        vg = ((android.view.ViewGroup) (vg.getParent()));
    } 
    return vg;
}