@java.lang.Override
protected ru.yandex.yamblz.callinformer.model.SearchResult doInBackground(java.lang.String... strings) {
    java.util.List<ru.yandex.yamblz.callinformer.model.SearchResult> results = new com.google.gson.GsonBuilder().registerTypeAdapter(new com.google.gson.reflect.TypeToken<java.util.ArrayList<ru.yandex.yamblz.callinformer.model.SearchResult>>() {    }.getType(), new ru.yandex.yamblz.callinformer.util.GoogleSearchJSONDeserializer()).create().fromJson(strings[0], new com.google.gson.reflect.TypeToken<java.util.ArrayList<ru.yandex.yamblz.callinformer.model.SearchResult>>() {    }.getType());
    return results.isEmpty() ? null : results.get(0);
}