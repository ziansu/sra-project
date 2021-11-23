protected void indent(int which, int delta) {
    long targetTaskId = taskAdapter.getItemId(which);
    if (targetTaskId <= 0)
        return ;
    
    try {
        updater.indent(getFilter(), list, targetTaskId, delta);
    } catch (java.lang.Exception e) {
        android.util.Log.e("drag", "Indent Error", e);
    }
    fragment.loadTaskListContent(true);
    onMetadataChanged(targetTaskId);
}