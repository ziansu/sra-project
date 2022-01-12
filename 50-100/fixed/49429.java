public static java.lang.String formatExtensionForDisplay(java.lang.String phone) throws us.mn.state.health.lims.common.exception.LIMSRuntimeException {
    java.lang.String returnPhone = null;
    if (phone != null) {
        try {
            returnPhone = phone.substring(13);
        } catch (java.lang.Exception e) {
            us.mn.state.health.lims.common.log.LogEvent.logError("StringUtil", "formatExtensionForDisplay()", e.toString());
        }
    }
    return returnPhone;
}