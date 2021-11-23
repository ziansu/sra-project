public java.util.List<model.Event> filter(java.util.List<model.Event> eventList, java.lang.Object... args) {
    java.util.List<model.Event> filteredList = new java.util.ArrayList<model.Event>();
    for (model.Event event : eventList) {
        if (checkFilterCondition(event, args)) {
            filteredList.add(event);
        }
    }
    return filteredList;
}