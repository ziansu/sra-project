public java.lang.String combineEntries(java.util.ArrayList<hu.henry.sleepkeep.SleepEntry> entries) {
    java.lang.String str = "";
    for (hu.henry.sleepkeep.SleepEntry entry : entries) {
        str += (entry.toDelimitedString()) + "~";
    }
    return str.substring(0, ((str.length()) - 1));
}