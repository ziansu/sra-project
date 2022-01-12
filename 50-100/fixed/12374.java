public java.util.Hashtable<java.lang.String, java.lang.String> toHashTable() {
    return new java.util.Hashtable<java.lang.String, java.lang.String>() {
        {
            put(sns.teamcity.model.DiskSpaceSummary.FREE_SPACE, java.lang.String.valueOf(freeSpace));
            put(sns.teamcity.model.DiskSpaceSummary.TOTAL_SPACE, java.lang.String.valueOf(totalSpace));
        }
    };
}