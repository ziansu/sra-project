private boolean hasViewReorderEnabled(android.view.View v) {
    return (v != null) && ((v.getTag(org.askerov.dynamicgrid.DynamicGridView.TAG_REORDER_DISABLED).toString()) != "true");
}