private void checkShowNextStepBar() {
    java.util.HashMap<java.lang.String, com.dexcaff.cragmapper.models.Node> nodes = com.dexcaff.cragmapper.models.Node.getAllNodesByCragId(this, ((long) (mCurrentCrag.properties.get(Crag._ID))));
    if ((nodes.size()) >= 1) {
        showNextStepActionBar();
    }else {
        hideAddNodeActionBar();
    }
}