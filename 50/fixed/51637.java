private java.lang.String determinePriority(java.lang.String content) {
    if (content.contains(main.java.logic.CommandParser.PRIORITY_FLAG)) {
        return content.substring(((content.indexOf(main.java.logic.CommandParser.PRIORITY_FLAG)) + 1)).trim();
    }else {
        return null;
    }
}