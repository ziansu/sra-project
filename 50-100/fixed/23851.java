protected void finishMathPerformance(P problem) {
    edu.vserver.misconception.MisconceptionPerformanceData mpd = getMathPerformanceData();
    edu.vserver.misconception.MisconceptionData mmd = getMisconceptionData(problem);
    if (mmd == null)
        return ;
    
    java.util.List<edu.vserver.misconception.MisconceptionTypeData> misconceptions = getMisconceptionTypeData(problem);
    if (misconceptions != null) {
        mmd.addMisconceptionTypes(misconceptions);
    }
    mmd.setTime(((java.lang.System.currentTimeMillis()) - (lastProblemStartTime)));
    mpd.addMisconceptionData(mmd);
}