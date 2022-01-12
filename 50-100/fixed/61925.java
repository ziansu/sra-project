@java.lang.Override
public void onBindViewHolder(com.blstream.neverendingstory.Class.TaskPreviewAdapter.ViewHolder holder, int position) {
    if ((listOfTasksInService.size()) != 0) {
        holder.mTitle.setText(manager.getTaskTitle(listOfTasksInService.get(position)));
        holder.progresBar.setProgress(((int) (manager.getTaskProgress(listOfTasksInService.get(position)))));
    }
}