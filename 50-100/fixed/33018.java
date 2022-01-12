private static java.lang.String serverFromLocation(java.lang.String location) {
    java.lang.String[] items = location.split("/");
    java.lang.String[] serverItems = java.util.Arrays.copyOfRange(items, 0, ((items.length) - 1));
    java.lang.String text = org.apache.commons.lang3.StringUtils.join(serverItems, "/");
    return text;
}