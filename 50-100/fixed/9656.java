@java.lang.Override
public void onBindViewHolder(com.example.brandon.habitlogger.RecyclerViewAdapters.HabitViewHolder holder, int position, java.util.List<java.lang.Object> payloads) {
    super.onBindViewHolder(holder, position, payloads);
    if ((payloads != null) && (!(payloads.isEmpty()))) {
        holder.setEntry(((com.example.brandon.habitlogger.HabitDatabase.DataModels.SessionEntry) (payloads.get(0))));
    }
}