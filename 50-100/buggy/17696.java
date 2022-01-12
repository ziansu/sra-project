public void getRow(android.widget.TableRow tr, org.json.JSONObject json_data, java.lang.String colName) {
    android.widget.TextView tv = new android.widget.TextView(activity);
    java.lang.String str;
    try {
        str = java.lang.String.valueOf(json_data.getString(colName));
        tv.setText(str);
        if (colName.equals("id"))
            row.setId(str);
        
        tv.setTextSize(15);
        tr.addView(tv);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}