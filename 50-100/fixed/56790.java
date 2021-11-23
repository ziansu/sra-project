@java.lang.Override
public boolean onLongClick(android.view.View v) {
    final int position = viewHolder.getAdapterPosition();
    com.goals.ted.goals.Goal currentGoal = goalList.get(position);
    android.util.Log.i("goal id: ", java.lang.String.valueOf(currentGoal.getId()));
    db.deleteRecord(currentGoal.getId());
    goalList.remove(position);
    notifyItemRemoved(position);
    return true;
}