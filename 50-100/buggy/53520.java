@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(se.mhakansson.todolist_android.CustomRecyclerAdapter.TAG, ("CLICK ON BUTTON " + (java.lang.Integer.toString(position))));
    org.json.JSONObject obj = new org.json.JSONObject();
    try {
        obj.put("url", ("/item/remove/" + (mArrayOfListItems.get(position).id)));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    DisplayListActivity.socket.emit("put", obj);
}