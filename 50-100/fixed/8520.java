public java.util.List<java.lang.Long> getRequiredMissionIds() {
    java.util.List<java.lang.Long> ids = new java.util.ArrayList<>();
    if ((requiredMissions) != null) {
        for (com.playposse.peertopeeroxygen.backend.peerToPeerOxygenApi.model.MissionBean missionBean : requiredMissions) {
            if (!(missionBean.getId().equals(com.playposse.peertopeeroxygen.android.widgets.RequiredMissionListView.BLANK_MISSION_ID))) {
                ids.add(missionBean.getId());
            }
        }
    }
    return ids;
}