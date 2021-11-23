@java.lang.Override
public java.lang.Object getGroup(int groupPosition) {
    try {
        return mItems.get(groupPosition);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}