public int getNumberOfEvents(java.util.ArrayList<java.lang.Integer> registrationID, int eventID) {
    return courseRepository.getNumberOfEvents(registrationID, eventID);
}