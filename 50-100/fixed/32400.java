public java.util.List<java.lang.String> processJson(java.util.List<edu.usc.cssl.tacit.common.queryprocess.Filter> corpusFilters, java.lang.String jsonFilepath, java.lang.String keyFields) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException, java.io.IOException, org.json.simple.parser.ParseException {
    if (null == corpusFilters)
        corpusFilters = new java.util.ArrayList<edu.usc.cssl.tacit.common.queryprocess.Filter>();
    
    java.util.List<java.lang.String> parentKeys = edu.usc.cssl.tacit.common.queryprocess.JsonParser.getParentKeys(jsonFilepath);
    edu.usc.cssl.tacit.common.queryprocess.QueryProcesser.createParentFilters(corpusFilters, parentKeys);
    return applySmartFilters(corpusFilters, jsonFilepath, "&&", keyFields);
}