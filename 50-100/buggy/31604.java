@java.lang.Override
public java.util.List<it.morfoza.Event> getByDance(java.lang.String danceName) {
    java.util.List<it.morfoza.Event> chosenEventList = new java.util.ArrayList<>();
    for (it.morfoza.Event event : eventList) {
        if (event.getDance().equals(danceName)) {
            chosenEventList.add(event);
            return chosenEventList;
        }
    }
    return chosenEventList;
}