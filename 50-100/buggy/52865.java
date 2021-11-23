@java.lang.Override
protected java.lang.String doInBackground(java.lang.Void... params) {
    java.lang.String itemName = null;
    try {
        com.example.benjamin.tingle2.networking.OutpanFetcher of = new com.example.benjamin.tingle2.networking.OutpanFetcher(mContext);
        java.lang.String jsonstring = of.getUrlString(mCode);
        if (jsonstring == null) {
            throw new java.io.IOException("Result is empty");
        }
        com.example.benjamin.tingle2.networking.JsonConvert jc = new com.example.benjamin.tingle2.networking.JsonConvert();
        itemName = jc.parseJsonString(jsonstring);
    } catch (java.io.IOException ioe) {
        mException = ioe;
    } catch (org.json.JSONException je) {
        mException = je;
    }
    return itemName;
}