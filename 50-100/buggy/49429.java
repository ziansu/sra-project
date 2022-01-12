public static java.lang.String formatExtensionForDisplay(java.lang.String phone) throws us.mn.state.health.lims.common.exception.LIMSRuntimeException {
    java.lang.String returnPhone = null;
    if (phone != null) {
        try {
            java.lang.String ext = phone.substring(13);
            returnPhone = ext;
        } catch (java.lang.Exception e) {
            us.mn.state.health.lims.common.log.LogEvent.logError("StringUtil", "formatExtensionForDisplay()", e.toString());
        }
    }
    return returnPhone;
}