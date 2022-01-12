@com.lzl.model.override
public void apply(final com.lzl.model.Document document) {
    count++;
    replyContents.add(new com.lzl.model.JSONObject().put("Identity", identity).put("Infotype", infotype).put("Detail", new com.lzl.model.JSONObject(document.toJson())));
}