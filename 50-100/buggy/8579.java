@java.lang.Override
public boolean createConnection() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    com.hida.model.DefaultSetting defaultEntity = DefaultSettingDao.getDefaultSetting();
    if (defaultEntity == null) {
        defaultEntity = new com.hida.model.DefaultSetting("", "", com.hida.model.TokenType.DIGIT, "ddddd", 5, true, true, true);
        DefaultSettingDao.save(defaultEntity);
    }
    CurrentSetting = defaultEntity;
    return true;
}