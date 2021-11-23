private com.cyb.tms.entity.UserStoryStaus getLatestStatus(com.cyb.tms.entity.TmsStoryMst tmsStoryMst) {
    java.util.List<com.cyb.tms.entity.UserStoryStaus> userStoryStatusList = new java.util.ArrayList<com.cyb.tms.entity.UserStoryStaus>();
    userStoryStatusList.addAll(tmsStoryMst.getUserStoryStauses());
    return ((com.cyb.tms.entity.UserStoryStaus) (userStoryStatusList.get(((userStoryStatusList.size()) - 1))));
}