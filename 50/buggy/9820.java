private void removeTimetableAt(int position) {
    getFileManager().delete(timetables.get(position).getName());
    timetables.remove(position);
    adapter.notifyItemRemoved(position);
    updateNoTimetablesTextView();
}