@java.lang.Override
public java.util.List<com.aquarius.simplev2ex.entity.TopicItem> parseResultToList(java.lang.String result) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.util.List<com.aquarius.simplev2ex.entity.TopicItem> data = gson.fromJson(result, new com.google.gson.reflect.TypeToken<java.util.List<com.aquarius.simplev2ex.entity.TopicItem>>() {    }.getType());
    int count = updateList(data);
    com.aquarius.simplev2ex.util.FileUtil.write(mContext, Constants.FILE_HOT_TOPICS_LIST, data);
    return data;
}