public java.lang.Integer doInTransaction(org.springframework.transaction.TransactionStatus arg0) {
    int cnt = 0;
    if (isNullToSave) {
        cnt = stockInfoDao.update(entity);
    }else {
        cnt = stockInfoDao.updateSelective(entity);
    }
    if (cnt == 1) {
        return cnt;
    }
    try {
        cnt = stockInfoDao.insert(entity);
    } catch (java.lang.Exception e) {
        LOGGER.error("\u63d2\u5165\u80a1\u7968\u8d22\u52a1\u62a5\u8868\u4fe1\u606f\u5931\u8d25\uff0c\u53c2\u6570{}\n{}", entity, e.getMessage());
    }
    return cnt;
}