public void addTask(utils.Event event) {
    int slot;
    int range;
    int i;
    if (checkTimeSlot(event)) {
        (numOfSlot)++;
        slot = convertIndex(convertTime(event.getStartDateTime()));
        range = convertIndex(convertTime(event.getEndDateTime()));
        for (i = slot; i < range; i++) {
            timeSlot.get(i).setTime(true, event);
        }
    }else {
    }
}