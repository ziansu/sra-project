@java.lang.Override
protected rjm.romek.facegame.ui.loader.LoadDataTaskResult doInBackground(java.lang.Void... arg0) {
    rjm.romek.facegame.ui.loader.LoadDataTaskResult result = null;
    try {
        try {
            java.lang.Thread.sleep(6000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        result = new rjm.romek.facegame.ui.loader.LoadDataTaskResultCorrect(deserializer.deserialize(context.getAssets().open(parameters.getCountryListFile())));
    } catch (java.io.IOException e) {
        result = new rjm.romek.facegame.ui.loader.LoadDataTaskResultException(e);
    }
    return result;
}