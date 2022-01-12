public java.util.Map<java.lang.String, java.lang.String> customFields() {
    java.lang.String[] value = ((java.lang.String[]) (get("custom_fields")));
    if (value == null) {
        return null;
    }
    return xyz.mkotb.xenapi.XenUtils.decodeMap(value);
}