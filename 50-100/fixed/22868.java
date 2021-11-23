@java.lang.Override
public void run() {
    parseSusiResponse(susiResponse, actionNo);
    final java.lang.String setMessage = answer;
    if (actionType.equals(Constant.ANSWER))
        voiceReply(setMessage, isHavingLink);
    
    updateDatabase(id, setMessage, false, null, false, actionType, mapData, isHavingLink, datumList);
}