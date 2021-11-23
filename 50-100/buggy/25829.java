@java.lang.Override
public void onBindViewHolder(com.org.runaway.sharetodo.adapter.TaskRecyclerAdapter.ViewHolder holder, int position) {
    if ((mItems) != null) {
        holder.subTaskTitle.setText(getItemAt(position).getSubTask().getSubTaskName());
        holder.subTaskText.setText(getItemAt(position).getSubTask().getSubTaskText());
    }
}