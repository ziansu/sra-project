protected org.json.JSONArray executeQuery(nl.b3p.viewer.config.app.ApplicationLayer al, nl.b3p.viewer.config.services.SimpleFeatureType ft, org.geotools.data.FeatureSource fs, org.geotools.data.Query q) throws java.io.IOException, java.lang.Exception, org.json.JSONException {
    nl.b3p.viewer.util.FeatureToJson ftjson = new nl.b3p.viewer.util.FeatureToJson(arrays, edit, graph, attributesToInclude, new java.util.ArrayList<java.lang.Long>());
    org.json.JSONArray features = ftjson.getJSONFeatures(al, ft, fs, q, null, null);
    return features;
}