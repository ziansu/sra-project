private void saveEvents(@android.support.annotation.NonNull
java.util.List<org.onebrick.android.models.Event> eventList, int chapterId) {
    for (org.onebrick.android.models.Event event : eventList) {
        if (org.onebrick.android.helpers.DateTimeFormatter.getInstance().isPastEvent(event.getEndDate())) {
            event.setPastEvent(true);
        }
        event.save();
    }
}