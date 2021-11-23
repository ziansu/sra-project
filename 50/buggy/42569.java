@java.lang.Override
public void removable(java.lang.Long targetId) throws java.lang.Exception {
    if ((trafficPolicyDao.findById(targetId, TrafficPolicyEntity.READSET_FULL).getActiveVersion()) != 0) {
        throw new com.ctrip.zeus.exceptions.ValidationException("Traffic policy that you try to delete is still active.");
    }
}