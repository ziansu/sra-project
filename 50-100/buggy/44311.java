@java.lang.Override
public com.adobe.fre.FREObject call(com.adobe.fre.FREContext arg0, com.adobe.fre.FREObject[] arg1) {
    java.lang.String achievementId = null;
    int numSteps;
    try {
        achievementId = arg1[0].getAsString();
        numSteps = arg1[0].getAsInt();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
    Extension.context.achievements.incrementAchivement(achievementId, numSteps);
    return null;
}