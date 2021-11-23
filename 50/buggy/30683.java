public void SynchroniserIntervention() {
    if (((mGoogleMap) != null) && (!(reloadingIntervention))) {
        reloadingIntervention = true;
        mGoogleMap.clear();
        chargerIntervention();
        reloadDrone();
    }
}