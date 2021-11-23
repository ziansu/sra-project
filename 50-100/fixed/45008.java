public static boolean validateLicense() {
    net.waqassiddiqi.app.crew.db.RegistrationSettingDAO regDao = new net.waqassiddiqi.app.crew.db.RegistrationSettingDAO();
    net.waqassiddiqi.app.crew.model.RegistrationSetting settings = regDao.get();
    if (net.waqassiddiqi.crewapp.license.util.SystemUtil.getRegistrationId().equals(settings.getSystemId())) {
        return true;
    }else {
        return false;
    }
}