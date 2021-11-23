public java.lang.String getDCAT() {
    long now = java.lang.System.currentTimeMillis();
    if ((time) <= (now - (org.gbif.ipt.task.GenerateDCAT.cachingTime))) {
        org.gbif.ipt.task.GenerateDCAT.LOG.info("Updating DCAT feed");
        time = now;
        DCAT = createDCATFeed();
    }
    return DCAT;
}