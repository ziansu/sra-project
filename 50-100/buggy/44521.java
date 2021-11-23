@java.lang.Override
protected void onPostExecute(java.lang.String[] res) {
    android.util.Log.d("MyWidget", ("Response string elems: " + (res.length)));
    if ((res.length) == (org.dkfsoft.KikimorWeather.sids.length)) {
        if ((res[0].substring(0, 1)) != "-")
            res[0] = "+" + (res[0]);
        
        alarm_manager.refreshValues(res);
    }
}