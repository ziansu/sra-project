public android.view.ViewGroup listItemParent(android.view.View view) {
    android.view.ViewGroup vg = ((android.view.ViewGroup) (view.getParent()));
    while ((vg.getId()) != (R.id.list_item_parent)) {
        vg = ((android.view.ViewGroup) (vg.getParent()));
    } 
    return vg;
}