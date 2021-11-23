@java.lang.Override
public java.lang.Object getChild(int groupPosition, int childPosition) {
    try {
        return mItems.get(groupPosition);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}