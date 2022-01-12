public boolean removeClosedCall(java.lang.String callId) {
    try {
        completedCallsHashMap.putIfAbsent(callId, java.lang.System.currentTimeMillis());
        callHashMap.remove(callId);
        ru.cti.verintsipbyehandler.ParseAndProcessCalls.logger.info((("Call " + callId) + " has been removed from current calls DB and added to completed calls DB"));
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        ru.cti.verintsipbyehandler.ParseAndProcessCalls.logger.catching(e);
        return false;
    }
}