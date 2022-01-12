public void apply(final com.lzl.model.Document document) {
    count++;
    replyContents.put(new com.lzl.model.JSONObject().put("Identity", identity).put("Infotype", infotype).put("Detail", new com.lzl.model.JSONObject(document.toJson())));
}