@org.springframework.transaction.annotation.Transactional
private void deleteProgress() {
    org.zstack.core.db.SimpleQuery<org.zstack.header.core.progress.ProgressVO> q = dbf.createQuery(org.zstack.header.core.progress.ProgressVO.class);
    q.add(ProgressVO_.processType, SimpleQuery.Op.EQ, ProgressConstants.ProgressType.LocalStorageMigrateVolume.toString());
    q.add(ProgressVO_.resourceUuid, SimpleQuery.Op.EQ, rootVolume.getUuid());
    java.util.List<org.zstack.header.core.progress.ProgressVO> list = q.list();
    if ((list.size()) > 0) {
        for (org.zstack.header.core.progress.ProgressVO p : list) {
            dbf.remove(p);
        }
    }
}