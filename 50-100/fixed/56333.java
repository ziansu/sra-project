public void deleteBackUpInfo(long rid) throws org.smartdata.metastore.MetaStoreException {
    try {
        org.smartdata.model.BackUpInfo backUpInfo = getBackUpInfo(rid);
        if ((backUpInfoDao.getBySrc(backUpInfo.getSrc()).size()) == 1) {
            setBackSrc.remove(backUpInfo.getSrc());
        }
        backUpInfoDao.delete(rid);
    } catch (java.lang.Exception e) {
        throw new org.smartdata.metastore.MetaStoreException(e);
    }
}