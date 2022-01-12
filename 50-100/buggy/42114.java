private void deleteProgress() {
    org.zstack.core.db.SimpleQuery<org.zstack.header.core.progress.ProgressVO> q = dbf.createQuery(org.zstack.header.core.progress.ProgressVO.class);
    q.add(ProgressVO_.processType, SimpleQuery.Op.EQ, ProgressConstants.ProgressType.LocalStorageMigrateVolume.toString());
    q.add(ProgressVO_.resourceUuid, SimpleQuery.Op.EQ, rootVolume.getUuid());
    if ((q.find()) != null) {
        try {
            dbf.remove(q.find());
        } catch (java.lang.Exception e) {
            org.zstack.storage.primary.local.LocalStorageKvmMigrateVmFlow.logger.warn("no need delete, it was deleted...");
        }
    }
}