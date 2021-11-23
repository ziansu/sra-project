public static void setResultFilterMethod(com.ghostflying.portalwaitinglist.util.SettingUtil.ResultFilterMethod resultFilterMethod) {
    if (resultFilterMethod == (com.ghostflying.portalwaitinglist.util.SettingUtil.getResultFilterMethod())) {
        com.ghostflying.portalwaitinglist.util.SettingUtil.options.edit().putInt(com.ghostflying.portalwaitinglist.util.SettingUtil.RESULT_FILTER_METHOD_NAME, resultFilterMethod.ordinal()).apply();
        com.ghostflying.portalwaitinglist.util.SettingUtil.notifyChange(resultFilterMethod);
    }
}