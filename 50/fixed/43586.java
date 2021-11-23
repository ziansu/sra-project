public void onClick(android.content.DialogInterface dialog, int whichButton) {
    getGlobalState().selectSketch(APDE.DEFAULT_SKETCH_NAME, APDE.SketchLocation.TEMPORARY);
    newSketch();
    forceDrawerReload();
    getSupportActionBar().setTitle(getGlobalState().getSketchName());
}