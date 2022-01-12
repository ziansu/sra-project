@javax.annotation.PostConstruct
public void init() {
    fieldsToIgnore = java.util.Arrays.asList(env.getProperty("elasticsearch.excludeFromIndexing", "").toLowerCase().split(","));
    eSCompatibleDateTimeFormatter = org.joda.time.format.DateTimeFormat.forPattern(esDatePattern);
    possibleFileExtensions = fileExts.split(",");
    uk.ac.kcl.rowmappers.DocumentRowMapper.LOG.info(("possible file extensions: " + (fileExts)));
}