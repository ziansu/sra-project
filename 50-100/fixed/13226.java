public void deleteTask(utils.Event event) {
    int slot;
    int range;
    int i;
    (numOfSlot)--;
    slot = convertIndex(convertTime(event.getStartDateTime()));
    range = convertIndex(convertTime(event.getEndDateTime()));
    for (i = slot; i < (range + 1); i++) {
        timeSlot.get(i).delete(event);
    }
}