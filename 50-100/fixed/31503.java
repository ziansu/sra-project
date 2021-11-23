public void matchDescription(java.util.ArrayList<ScheduleHacks.Task> destinationList, ScheduleHacks.Task taskToFind, ScheduleHacks.Task taskToCheck) {
    java.lang.String descToFind = taskToFind.getDescription().toLowerCase();
    if ((descToFind.length()) == 1) {
        if (taskToCheck.getDescription().toLowerCase().startsWith(descToFind)) {
            destinationList.add(taskToCheck);
        }
    }else {
        if (taskToCheck.getDescription().toLowerCase().contains(descToFind)) {
            destinationList.add(taskToCheck);
        }
    }
}