public static void main(java.lang.String[] args) {
    mapreport.util.Log.info("start main");
    @java.lang.SuppressWarnings(value = "unused")
    java.lang.String json = null;
    java.util.Set<mapreport.filter.NameFilter> nameFilters = new java.util.HashSet<mapreport.filter.NameFilter>(3);
    nameFilters.add(new mapreport.filter.DBFilter("Fire"));
    int timeFilterCntr = 0;
    json = mapreport.resp.ResponseBuilder.buildJson(null, nameFilters, timeFilterCntr, 200, "", "", new mapreport.front.option.Options());
    mapreport.util.Log.log("end main");
}