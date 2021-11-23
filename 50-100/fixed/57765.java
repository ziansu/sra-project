protected void onPostExecute(android.graphics.Path o) {
    if ((error) != "") {
        logToast(("An error happened while creating graph:" + (error)));
        com.junjunguo.pocketmaps.model.util.MyApp.tracker().send(new com.google.android.gms.analytics.HitBuilders.ExceptionBuilder().setDescription((("MapHandler-loadGraphStorage: " + "") + (error))).setFatal(false).build());
    }else {
    }
    com.junjunguo.pocketmaps.model.util.Variable.getVariable().setPrepareInProgress(false);
}