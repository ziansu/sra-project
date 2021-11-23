public static java.time.LocalDateTime getLocalDategFromString(java.lang.String gateINDateTime) {
    try {
        if ((org.apache.commons.lang3.StringUtils.isNotEmpty(gateINDateTime)) || (!(org.apache.commons.lang3.StringUtils.equals("0", gateINDateTime)))) {
            java.time.format.DateTimeFormatter dateFormat = java.time.format.DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            return java.time.LocalDateTime.parse(gateINDateTime, dateFormat);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}