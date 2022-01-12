public boolean srcInbackup(java.lang.String src) throws org.smartdata.metastore.MetaStoreException {
    if ((setBackSrc) == null) {
        setBackSrc = new java.util.HashSet<>();
        java.util.List<org.smartdata.model.BackUpInfo> backUpInfos = listAllBackUpInfo();
        for (org.smartdata.model.BackUpInfo backUpInfo : backUpInfos) {
            setBackSrc.add(backUpInfo.getSrc());
        }
        return setBackSrc.contains(src);
    }
    for (java.lang.String srcDir : setBackSrc) {
        if (src.startsWith(srcDir)) {
            return true;
        }
    }
    return false;
}