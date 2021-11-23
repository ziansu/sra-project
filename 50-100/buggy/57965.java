public com.derbysoft.nuke.dlm.server.status.StatsCenter.Stats register(java.lang.String resourceId, com.derbysoft.nuke.dlm.IPermit permit) {
    com.derbysoft.nuke.dlm.server.status.StatsCenter.PermitStats permitStats = this.permitStats.putIfAbsent(resourceId, new com.derbysoft.nuke.dlm.server.status.StatsCenter.PermitStats(permit));
    if (permitStats != null) {
        permitStats.setPermit(permit);
    }
    return this.permitStats.get(resourceId);
}