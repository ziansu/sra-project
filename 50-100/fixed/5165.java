private void initMissionManager() {
    dji.sdk.base.DJIBaseProduct product = com.dji.GSDemo.GoogleMap.DJIDemoApplication.getProductInstance();
    if ((product == null) || (!(product.isConnected()))) {
        setResultToToast("Disconnected");
        mMissionManager = null;
        return ;
    }else {
        setResultToToast("Product connected");
        mMissionManager = product.getMissionManager();
        mMissionManager.setMissionProgressStatusCallback(this);
        mMissionManager.setMissionExecutionFinishedCallback(this);
    }
    mWaypointMission = new dji.sdk.missionmanager.DJIWaypointMission();
}