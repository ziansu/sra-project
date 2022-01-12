private void filterRobotIpRecord(java.util.List<architecture.bean.BlockRecordBean> records) {
    if (records == null) {
        return ;
    }
    for (architecture.bean.BlockRecordBean record : records) {
        long expireTime = record.getBlockTime();
        long currentTime = java.lang.System.currentTimeMillis();
        if (expireTime <= currentTime) {
            java.lang.String id = record.getId();
            blockRecordDao.delete(id);
        }
    }
}