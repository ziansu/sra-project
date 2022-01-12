public boolean srcInbackup(java.lang.String src) throws org.smartdata.metastore.MetaStoreException {
    if ((setBackSrc) == null) {
        setBackSrc = new java.util.HashSet<>();
        java.util.List<org.smartdata.model.BackUpInfo> backUpInfos = listAllBackUpInfo();
        for (org.smartdata.model.BackUpInfo backUpInfo : backUpInfos) {
            setBackSrc.add(backUpInfo.getSrc());
        }
    }
    org.smartdata.metastore.MetaStore.LOG.info("Backup src = {}, setBackSrc {}", src, setBackSrc);
    for (java.lang.String srcDir : setBackSrc) {
        if (src.startsWith(srcDir)) {
            return true;
        }
    }
    return false;
}