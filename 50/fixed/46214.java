public void goToSceneComments(android.view.View view) {
    try {
        sceneId = Constants.sceneImages;
        moveButton(view, true);
    } catch (java.lang.Exception ex) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(Constants.LOG, ex.getMessage());
        }
    }
}