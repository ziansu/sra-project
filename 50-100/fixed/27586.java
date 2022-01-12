public boolean leaveQueue(java.lang.String studentId, java.lang.String sessionId) {
    if (!(runningStates.keySet().contains(sessionId.toUpperCase()))) {
        java.lang.System.out.println("Error in leaveQueue: session does not exist");
    }
    edu.up.projects.engineering.LabState labState = runningStates.get(sessionId);
    java.util.ArrayList<java.lang.String> queue = labState.getLabQueue();
    if (queue.contains(studentId)) {
        queue.remove(studentId);
        return true;
    }
    return false;
}