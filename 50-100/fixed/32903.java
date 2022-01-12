private java.lang.String getAbsolutePath(java.lang.String key, int bizId) {
    com.nengjun.app.plant.web.enums.BizCode bizCode = com.nengjun.app.plant.web.enums.BizCode.valueOf(bizId);
    if (bizCode == null) {
        return null;
    }
    java.lang.String domain = ("prod".equals(globalSetting.getEnv())) ? bizCode.getProd() : bizCode.getDev();
    return domain + key;
}