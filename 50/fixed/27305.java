public void initialize() {
    basisLocale = compareLocaleDao.getBasisLocale();
    if ((basisLocale) != null) {
        offsetMinutes = 0;
        initView();
    }
}