@java.lang.Override
public void onResponse(java.lang.String response) {
    com.dante.knowledge.mvp.model.ZhihuJson zhihuJson = com.dante.knowledge.net.Json.parseZhihuNews(response);
    com.dante.knowledge.net.DB.findAllDateSorted(com.dante.knowledge.mvp.model.ZhihuJson.class);
    update(zhihuJson);
    date = zhihuJson.getDate();
    com.dante.knowledge.utils.SPUtil.save(Constants.DATE, date);
    listener.onSuccess(zhihuJson);
}