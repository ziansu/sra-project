public java.util.List<dao.IndicatorDao> getIndicators() {
    return (this.cachedIndicators) == null ? dao.IndicatorDao.getAllIndicators(this.symbol) : this.cachedIndicators;
}