static <VH extends RecyclerView.ViewHolder> com.staticbloc.widgets.recyclerview.ReordererAdapterDecorator<VH> decorateAdapter(final android.support.v7.widget.RecyclerView.Adapter<VH> adapterToDecorate, android.content.ClipData clipData) {
    if (adapterToDecorate == null) {
        throw new java.lang.NullPointerException("reorderable adapter cannot be null");
    }
    if (!(adapterToDecorate instanceof com.staticbloc.widgets.recyclerview.ReorderableAdapter)) {
        throw new java.lang.IllegalArgumentException("reorderable adapter must implement ReorderableAdapter or one of its subinterfaces");
    }
    return new com.staticbloc.widgets.recyclerview.ReordererAdapterDecorator<com.staticbloc.widgets.recyclerview.VH>(adapterToDecorate, clipData);
}