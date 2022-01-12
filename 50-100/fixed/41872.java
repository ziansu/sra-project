@javax.annotation.PostConstruct
public void init() {
    fieldsToIgnore = java.util.Arrays.asList(env.getProperty("elasticsearch.excludeFromIndexing", "").toLowerCase().split(","));
    eSCompatibleDateTimeFormatter = org.joda.time.format.DateTimeFormat.forPattern(esDatePattern);
    if (null != (fileExts)) {
        possibleFileExtensions = fileExts.split(",");
        uk.ac.kcl.rowmappers.DocumentRowMapper.LOG.info(("possible file extensions: " + (fileExts)));
    }
}