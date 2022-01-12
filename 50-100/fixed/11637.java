@java.lang.Override
protected mmt.uit.placehelper.models.Direction doInBackground(java.lang.String... params) {
    mmt.uit.placehelper.models.Direction direct = new mmt.uit.placehelper.models.Direction();
    direct = mmt.uit.placehelper.services.SearchPlace.getDirection(curLoc.getLat(), curLoc.getLng(), plDetail.getGeometry().getLocation().getLat(), plDetail.getGeometry().getLocation().getLng(), params[0]);
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return direct;
}