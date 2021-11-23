@java.lang.Override
public void deactiveGroup(java.lang.Long groupId, java.lang.Long slbId) throws java.lang.Exception {
    confGroupActiveDao.deleteByGroupIdAndSlbId(new com.ctrip.zeus.service.activate.impl.ConfGroupActiveDo().setGroupId(groupId).setSlbId(slbId));
    confGroupActiveDao.deleteByGroupIdAndSlbId(new com.ctrip.zeus.service.activate.impl.ConfGroupActiveDo().setGroupId(groupId).setSlbId(0));
    confGroupSlbActiveDao.deleteByGroupIdSlbId(new com.ctrip.zeus.service.activate.impl.ConfGroupSlbActiveDo().setGroupId(groupId).setSlbId(slbId));
    serverGroupService.deleteByGroupId(groupId);
}