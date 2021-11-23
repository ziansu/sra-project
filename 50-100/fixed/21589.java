public boolean allowAnswerType(int groupID, java.lang.String senderID) {
    int groupNo = getGroupNo(groupID);
    long timeDiff = (java.lang.System.currentTimeMillis()) - (answerTypeTime[groupNo]);
    boolean answerTypePriority = (senderID.equals(answerTypeID[groupNo])) || (timeDiff > (answerTimeout));
    if (answerTypePriority) {
        answerTypeID[groupNo] = senderID;
        answerTypeTime[groupNo] = java.lang.System.currentTimeMillis();
    }
    return answerTypePriority;
}