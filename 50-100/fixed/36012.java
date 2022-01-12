@java.lang.Override
protected void setDo(com.ctrip.zeus.model.entity.Group object, com.ctrip.zeus.model.entity.GroupVirtualServer value, com.ctrip.zeus.service.model.handler.impl.RelGroupVsDo target) {
    target.setGroupId(object.getId()).setVsId(value.getVirtualServer().getId()).setPath(value.getPath()).setPriority(value.getPriority()).setGroupVersion(object.getVersion());
}