public void getFeeds(@android.support.annotation.NonNull
com.popdeem.sdk.core.api.PDAPICallback<java.util.ArrayList<com.popdeem.sdk.core.model.PDFeed>> callback) {
    com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(PDFeedsDeserializer.FEEDS_TYPE, new com.popdeem.sdk.core.deserializer.PDFeedsDeserializer()).create();
    com.popdeem.sdk.core.api.PopdeemAPI api = getApiInterface(getUserTokenInterceptor(), new retrofit.converter.GsonConverter(gson));
    api.getFeeds("20", callback);
}