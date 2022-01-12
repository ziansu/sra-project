@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((position < 0) || (position >= (listData.size()))) {
        return ;
    }
    com.jayfeng.androiddigest.webservices.json.ToolJson toolJson = listData.get(position);
    java.lang.String url = toolJson.getUrl();
    android.content.Intent intent = new android.content.Intent(getActivity(), com.jayfeng.androiddigest.activity.WebViewActivity.class);
    intent.putExtra(WebViewActivity.KEY_URL, url);
    startActivity(intent);
}