private java.util.List<ITableInfo> convertIntoTableRows(java.util.List<SlaveDetails> slaveLst, java.util.List<FrameworkDetails> frameworkDetailsLst, java.util.List<FrameworkSlaveRelationship> runsOn) {
    java.util.List<ITableInfo> lst = new java.util.ArrayList<>();
    slaveTableRows(slaveLst, lst);
    frameworkTableRows(frameworkDetailsLst, lst);
    runsOnTableRows(runsOn, lst);
    MesosMetric.LOGGER.log(java.util.logging.Level.FINE, ("[Collector Plugin] Total no of rows to be inserted " + (lst.size())));
    return lst;
}