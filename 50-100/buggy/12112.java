@java.lang.SuppressWarnings(value = "unchecked")
public <T extends org.opennaas.extensions.router.model.SettingData> java.util.List<T> getAllElementSettingDataByType(java.lang.Class<T> clazz) {
    java.util.List<org.opennaas.extensions.router.model.SettingData> list = getElementsSettingData();
    java.util.ArrayList<T> toReturn = new java.util.ArrayList<T>();
    for (org.opennaas.extensions.router.model.SettingData settingData : list) {
        if (clazz.getClass().isInstance(settingData)) {
            toReturn.add(((T) (settingData)));
        }
    }
    return toReturn;
}