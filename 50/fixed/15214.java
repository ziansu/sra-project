@java.lang.Override
public com.monits.agilefant.adapter.recyclerviewholders.TaskItemViewHolder onCreateViewHolder(final android.view.ViewGroup parent, final int viewType) {
    final android.view.View view = inflater.inflate(R.layout.my_tasks_item, parent, false);
    return new com.monits.agilefant.adapter.recyclerviewholders.TaskItemViewHolder(view, context, this);
}