public void filter(java.lang.String query) {
    if (android.text.TextUtils.isEmpty(query)) {
        eventsArray = new java.util.ArrayList(eventsArray);
    }else {
        eventsArray.clear();
        for (com.example.hai.eventfinder.Event value : originalEventData) {
            if (value.toString().toLowerCase().contains(query.toLowerCase())) {
                eventsArray.add(value);
            }
        }
    }
}