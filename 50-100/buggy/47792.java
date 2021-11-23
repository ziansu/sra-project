public net.sf.json.JSONObject deleteSearchHistory(@org.springframework.web.bind.annotation.RequestParam(value = "historyUuid")
java.lang.String historyUuid) {
    net.sf.json.JSONObject json = new net.sf.json.JSONObject();
    org.openmrs.module.chartsearch.ChartSearchCache cache = new org.openmrs.module.chartsearch.ChartSearchCache();
    if (cache.deleteSearchHistory(historyUuid)) {
        json.put("searchHistory", org.openmrs.module.chartsearch.GeneratingJson.getAllSearchHistoriesToSendToTheUI());
        return json;
    }else
        return null;
    
}