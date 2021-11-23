private int getAdapterItemPosition(long habitId) {
    for (int position = 0; position < (getItemCount()); position++) {
        if ((this.habitsList.get(position).getDatabaseId()) == habitId)
            return position;
        
    }
    return 0;
}