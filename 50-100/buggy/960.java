public java.lang.String extractDateAndInputLine(java.lang.String inputLine, java.util.List<parser.DateGroup> groups) {
    for (parser.DateGroup group : groups) {
        java.util.List<java.util.Date> dates = group.getDates();
        if ((dates.size()) == 2) {
            setStartEndTime(group, dates);
        }else
            if ((dates.size()) == 1) {
                setEndTime(group, dates);
            }
        
        inputLine = removeDateFromInputLine(inputLine, group);
    }
    return inputLine;
}