@java.lang.Override
public java.util.Set<java.lang.Long> getSlbIdsByGroupId(java.lang.Long groupId) throws java.lang.Exception {
    java.util.Set<java.lang.Long> slbIds = new java.util.HashSet<>();
    java.util.List<com.ctrip.zeus.service.activate.impl.ConfGroupSlbActiveDo> result = confGroupSlbActiveDao.findByGroupId(groupId, ConfGroupSlbActiveEntity.READSET_FULL);
    if ((result == null) || ((result.size()) == 0)) {
        return slbIds;
    }else {
        for (com.ctrip.zeus.service.activate.impl.ConfGroupSlbActiveDo confGroupSlbActiveDo : result) {
            slbIds.add(confGroupSlbActiveDo.getSlbId());
        }
        return slbIds;
    }
}