private static java.sql.Time convertTime(java.lang.String inTime) {
    java.lang.System.out.println(("convertTime() inTime:" + inTime));
    try {
        java.sql.Time time = java.sql.Time.valueOf(inTime);
        return time;
    } catch (java.lang.Exception parseException) {
        java.lang.System.err.println(("DataImporter::convertTime() Error converting " + inTime));
        java.lang.System.exit(callcentrevisualiser.DataImporter.FAILURE);
    }
    return null;
}