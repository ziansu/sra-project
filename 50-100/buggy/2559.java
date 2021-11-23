public com.arthur_markus.SampleWebsite.models.DisplayDataWrapper displayData(java.lang.String searchTerm, java.lang.String orderType, int orderColumn, int offset, int limit) {
    com.arthur_markus.SampleWebsite.models.DisplayDataWrapper retVal = new com.arthur_markus.SampleWebsite.models.DisplayDataWrapper();
    java.util.List<com.arthur_markus.SampleWebsite.models.DisplayData> data = databaseTablesMapper.findAndSortDataToDisplay(searchTerm, getSorting(orderType, orderColumn), offset, (limit - 1));
    retVal.setData(data);
    return retVal;
}