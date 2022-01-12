@java.lang.Override
protected java.lang.String doInBackground(java.lang.String[] params) {
    try {
        pl.edu.agh.gethere.connection.HttpConnectionProvider httpConnectionProvider = new pl.edu.agh.gethere.connection.HttpConnectionProvider(pl.edu.agh.gethere.controller.AddPoiActivity.ADDITIONAL_INFO_HOST);
        httpConnectionProvider.getConnection().setRequestMethod("GET");
        return httpConnectionProvider.sendGetHttpRequest();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}