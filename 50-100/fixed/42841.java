@java.lang.Override
protected com.alibaba.fastjson.JSONArray doExtract(java.lang.String html, com.alibaba.fastjson.JSONObject param, java.util.List<java.lang.String> list) throws com.alibaba.trip.tripspider.extractor.domain.exception.TrspExtractException {
    org.jsoup.nodes.Document document = com.alibaba.trip.tripspider.extractor.TrspExtractUtils.toDocument(html);
    com.alibaba.fastjson.JSONArray noteDetail = new com.alibaba.fastjson.JSONArray();
    com.alibaba.fastjson.JSONObject jsonObject = new com.alibaba.fastjson.JSONObject();
    jsonObject.put("data", com.hackx.spiders.BaiDuNotesDetailCrawler.extractNoteDetail(document));
    noteDetail.add(jsonObject);
    return noteDetail;
}