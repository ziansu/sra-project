private java.lang.String removeJmsModule(java.lang.String destination) {
    java.lang.String destName = org.apache.commons.lang.StringUtils.substringAfter(destination, "!");
    return org.apache.commons.lang.StringUtils.isEmpty(destName) ? destination : destName;
}