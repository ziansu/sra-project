@java.lang.Override
public void onItemSelected(com.jaredrummler.materialspinner.MaterialSpinner view, int position, long id, java.lang.Object item) {
    currentGraphType = position;
    update(true);
}