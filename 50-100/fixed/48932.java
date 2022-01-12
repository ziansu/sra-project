private java.lang.String nattyManipulation(java.lang.String taskDate) {
    try {
        com.joestelmach.natty.Parser parser = new com.joestelmach.natty.Parser();
        java.util.List<com.joestelmach.natty.DateGroup> dateGroupList = parser.parse(taskDate);
        java.util.Date parsedDate = dateGroupList.get(0).getDates().get(0);
        return userOutputDateFormat.format(parsedDate);
    } catch (java.lang.IndexOutOfBoundsException e) {
        return taskDate;
    }
}