public boolean confirmTimeslot(int timeslotIndex) {
    project.taskcrusher.model.event.Timeslot confirmed = timeslots.get(timeslotIndex);
    timeslots = new java.util.ArrayList<project.taskcrusher.model.event.Timeslot>();
    timeslots.add(confirmed);
    return true;
}