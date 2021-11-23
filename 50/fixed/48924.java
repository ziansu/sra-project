public static java.lang.String convertBreaksToLineSeparators(java.lang.String pageContent) {
    return pageContent.replaceAll("<br/>", java.lang.System.getProperty("line.separator"));
}