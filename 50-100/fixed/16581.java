@java.lang.Override
public void onDragEnded(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    toPosition = holder.getAdapterPosition();
    if ((((toPosition) >= 0) && ((fromPosition) >= 0)) && ((toPosition) != (fromPosition))) {
        commandManager.execute(new net.osmand.plus.measurementtool.command.ReorderPointCommand(measurementLayer, fromPosition, toPosition));
        adapter.notifyDataSetChanged();
        disable(redoBtn);
        mapActivity.refreshMap();
        saved = false;
    }
}