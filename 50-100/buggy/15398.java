@java.lang.Override
public int compare(com.ctrip.zeus.service.build.impl.Group o1, com.ctrip.zeus.service.build.impl.Group o2) {
    int result = (((com.ctrip.zeus.service.build.impl.GroupVirtualServer) (objectOnVsReferrer.get(("gvs-" + (o2.getId()))))).getPriority()) - (((com.ctrip.zeus.service.build.impl.GroupVirtualServer) (objectOnVsReferrer.get(("gvs-" + (o2.getId()))))).getPriority());
    return result == 0 ? o2.getId().compareTo(o1.getId()) : result;
}