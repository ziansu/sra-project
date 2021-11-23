private static boolean isLineLongDate(java.lang.String line) {
    java.lang.String[] lineParts = line.split(",");
    if ((lineParts.length) < 2)
        return false;
    
    java.lang.String[] monthDay = lineParts[0].split(" ");
    java.lang.String year = lineParts[1];
    java.lang.System.out.println((((monthDay[1]) + " ") + year));
    return (org.apache.commons.lang.StringUtils.isNumeric(year)) && (org.apache.commons.lang.StringUtils.isNumeric(monthDay[1]));
}