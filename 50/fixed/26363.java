public void addMissionItem(int index, com.o3dr.services.android.lib.drone.mission.item.MissionItem missionItem) {
    missionItemProxies.add(index, new org.droidplanner.android.proxy.mission.item.MissionItemProxy(this, missionItem));
    notifyMissionUpdate();
}