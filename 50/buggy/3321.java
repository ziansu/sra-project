public java.util.Hashtable<java.lang.String, java.lang.String> diskSpaceSummary() {
    java.io.File workDirectory = buildAgent.getConfiguration().getWorkDirectory();
    return new sns.teamcity.model.DiskSpaceSummary(workDirectory.getTotalSpace(), workDirectory.getFreeSpace()).toHashTable();
}