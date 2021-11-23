@java.lang.Override
public void onComplete(com.vk.sdk.api.VKResponse response) {
    super.onComplete(response);
    try {
        setMessageInfo(response);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    listAdapter.notifyDataSetChanged();
}