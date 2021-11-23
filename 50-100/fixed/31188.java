public int getIntValueForKey(java.lang.String valueKey) {
    try {
        java.lang.String returnedValue = jedis.get(valueKey);
        java.lang.System.out.println(valueKey);
        if ((returnedValue != null) && ((returnedValue.length()) > 0)) {
            int parsedIntegerValue = java.lang.Integer.parseInt(returnedValue.replaceAll("\\D", ""));
            return parsedIntegerValue;
        }else {
        }
    } catch (java.lang.Exception e) {
        com.digitalcraftinghabitat.forgemod.util.DCHLog.error(e);
    }
    return -1;
}