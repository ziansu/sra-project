@java.lang.Override
public void onComplete(final com.vk.sdk.api.VKResponse response) {
    super.onComplete(response);
    news.clear();
    try {
        news.addAll(new com.vkclient.parsers.NewsParser().getNewsList(response));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    listAdapter.notifyDataSetChanged();
}