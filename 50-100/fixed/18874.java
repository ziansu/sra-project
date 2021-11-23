public boolean update(java.lang.String resourceId, java.lang.String permitName, com.derbysoft.nuke.dlm.PermitSpec spec) {
    log.debug("Update permit {} with spec {} by id {}", permitName, spec, resourceId);
    com.derbysoft.nuke.dlm.IPermit permit = buildPermit(permitName, spec);
    com.derbysoft.nuke.dlm.server.status.StatsCenter.getInstance().update(resourceId, permit);
    repository.put(resourceId, permit);
    return true;
}