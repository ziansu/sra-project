public void removeDueDate(android.content.Context context, int termPosition, int sectionPosition, int dueDatePosition) {
    dueDates.remove(dueDatePosition);
    com.sarmento.mitchell.gradesaver2.model.DBHelper db = new com.sarmento.mitchell.gradesaver2.model.DBHelper(context);
    db.removeDueDate(termPosition, sectionPosition, dueDatePosition);
    if (dueDatePosition == (dueDates.size())) {
        sortDueDates(context, termPosition, sectionPosition);
    }
}