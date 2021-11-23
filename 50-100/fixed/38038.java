public void initConfig() {
    topItemNumber = ((java.lang.Integer) (ConfigManager.propertiesMap.get(ConfigManager.TOP_ITEM_NUMBER)));
    counterNumber = ((java.lang.Integer) (ConfigManager.propertiesMap.get(ConfigManager.COUNTER_NUMBER)));
    Log.log.info((((("[TopK] " + "counterNumber = ") + (counterNumber)) + ", topItemNumber = ") + (topItemNumber)));
}