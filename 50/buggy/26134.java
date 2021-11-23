public void assignActivity(TimeManagement.Domain.Activity a) {
    if ((a.getStartWeek()) <= (currentWeek)) {
        assignedActivites.add(a);
    }else {
        futureAssignedActivties.add(a);
    }
}