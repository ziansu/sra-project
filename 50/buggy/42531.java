public void setNotiAcheTime(int acheTime) {
    config.setNotiAcheTerms(acheTime);
    configDao.update(config);
}