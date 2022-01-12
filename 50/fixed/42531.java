public void setNotiAcheTime(int acheTime) {
    config.setNotiAcheTime(acheTime);
    configDao.update(config);
}