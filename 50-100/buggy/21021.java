private static java.lang.String detectSprintOfLine(java.lang.String line) {
    java.lang.String dateTimeStr = line.split("\",\"")[2].replace("\"", "");
    org.joda.time.LocalDateTime dateTime = org.joda.time.LocalDateTime.parse(dateTimeStr, com.constellio.sdk.dev.tools.com.constellio.sdk.dev.tools.SplitGitCommentsMain.formatter);
    for (com.constellio.sdk.dev.tools.com.constellio.sdk.dev.tools.SplitGitCommentsMain.Sprint sprint : com.constellio.sdk.dev.tools.com.constellio.sdk.dev.tools.SplitGitCommentsMain.sprints) {
        if ((sprint.beginDate.isBefore(dateTime)) && (sprint.endDate.isAfter(dateTime))) {
            return sprint.name;
        }
    }
    throw new java.lang.RuntimeException((("Cannot detect sprint of '" + line) + "'"));
}