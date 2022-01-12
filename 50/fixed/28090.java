public org.polar.athena.domain.InfoShareholder getLatestShareholder(int stockId) {
    return shareholderDao.getLatest(stockId);
}