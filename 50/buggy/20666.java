public boolean confirmTimeslot(int timeslotIndex) {
    project.taskcrusher.model.event.Timeslot confirmed = timeslots.get(timeslotIndex);
    timeslots.clear();
    timeslots.add(confirmed);
    return true;
}