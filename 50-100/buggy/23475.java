public static int getIntValue(javax.servlet.http.HttpServletRequest req, java.lang.String name, int defaultValue) {
    int result = defaultValue;
    java.lang.String str = com.globalsight.everest.servlet.util.ServletUtil.getValue(req, name, "-1");
    try {
        result = java.lang.Integer.parseInt(str);
    } catch (java.lang.Exception e) {
        com.globalsight.everest.servlet.util.ServletUtil.logger.error((("Cannot parse string " + str) + " to integer."), e);
    }
    return result;
}