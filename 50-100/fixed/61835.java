private java.lang.String getDataSetURLSuffix(org.runnerup.export.format.GoogleFitData.DataSourceType source, long startTime, long endTime) {
    java.lang.StringBuilder urlSuffix = new java.lang.StringBuilder();
    urlSuffix.append(GoogleFitUploader.REST_DATASOURCE).append("/").append(org.runnerup.export.FormCrawler.URLEncode(source.getDataStreamId(this))).append("/").append(GoogleFitUploader.REST_DATASETS).append("/").append(startTime).append("-").append(endTime);
    return urlSuffix.toString();
}