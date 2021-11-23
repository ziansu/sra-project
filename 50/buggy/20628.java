public java.lang.String getTemp_max() {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(temp_max)) {
        return (temp_max) + "°F";
    }
    return "N/A";
}