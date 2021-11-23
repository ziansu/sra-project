private static java.lang.String commandSubmitBugReport(java.lang.String arg) {
    if (com.kerbybit.chattriggers.globalvars.global.canUse) {
        return "submitfakebugreport";
    }
    com.kerbybit.chattriggers.references.BugTracker.send();
    return arg;
}