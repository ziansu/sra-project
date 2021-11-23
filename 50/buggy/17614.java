public java.util.Map<java.lang.String, java.lang.String> customFields() {
    java.lang.String value = castGet("custom_fields", java.lang.String.class);
    if (value == null) {
        return null;
    }
    return xyz.mkotb.xenapi.XenUtils.decodeMap(value);
}