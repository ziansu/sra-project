@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.util.Log.d("history", (("item " + i) + "clicked!"));
    if ((gotoDetails) != null) {
        org.json.JSONObject jsonObject = ((org.json.JSONObject) (mData.get((i - 1)).get("jsonObject")));
        gotoDetails.gotoDetails(jsonObject);
    }
}