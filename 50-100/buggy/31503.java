public void matchDescription(java.util.ArrayList<ScheduleHacks.Task> destinationList, ScheduleHacks.Task taskToFind, ScheduleHacks.Task taskToCheck) {
    java.lang.String descToFind = taskToFind.getDescription().toLowerCase();
    if (taskToCheck.getDescription().toLowerCase().contains(descToFind)) {
        destinationList.add(taskToCheck);
    }
}