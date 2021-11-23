public static java.lang.Long toStata(java.sql.Timestamp datetime) {
    java.lang.Long javadate = datetime.toInstant().toEpochMilli();
    return javadate - (org.paces.Stata.Utilities.StataXTTS.STATAOFFSET);
}