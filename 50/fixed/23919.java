private static boolean isEndsWithZip(java.lang.String fileName) {
    if (org.springframework.util.StringUtils.isEmpty(fileName)) {
        return false;
    }
    return fileName.trim().toLowerCase().endsWith(".zip");
}