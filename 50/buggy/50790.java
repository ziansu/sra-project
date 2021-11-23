private synchronized double getProgressForClientID(java.lang.String clientID) {
    double toFinish = mappingClientIDtoExpectedResultsSize.get(clientID);
    double finished = mappingClientIDtoFinishedPartialResults.get(clientID).size();
    return toFinish / finished;
}