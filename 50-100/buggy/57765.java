protected void onPostExecute(android.graphics.Path o) {
    if (hasError()) {
        logToast(("An error happened while creating graph:" + (getErrorMessage())));
        com.junjunguo.pocketmaps.model.util.MyApp.tracker().send(new com.google.android.gms.analytics.HitBuilders.ExceptionBuilder().setDescription((("MapHandler-loadGraphStorage: " + "") + (getErrorMessage()))).setFatal(false).build());
    }else {
    }
    com.junjunguo.pocketmaps.model.util.Variable.getVariable().setPrepareInProgress(false);
}