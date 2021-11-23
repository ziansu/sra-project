public boolean allowAnswerType(int groupID, java.lang.String senderID) {
    int groupNo = getGroupNo(groupID);
    long timeDiff = (java.lang.System.currentTimeMillis()) - (answerTypeTime[groupNo]);
    answerTypeTime[groupNo] = java.lang.System.currentTimeMillis();
    boolean answerTypePriority = (senderID.equals(answerTypeID[groupNo])) || (timeDiff > (answerTimeout));
    if (answerTypePriority)
        answerTypeID[groupNo] = senderID;
    
    return answerTypePriority;
}