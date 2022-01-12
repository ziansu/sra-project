public java.util.HashMap<java.lang.String, java.util.Optional<java.lang.String>> putVariablesInMap(seedu.address.logic.parser.CommandParserHelper.OptionalStringTask task) {
    java.util.HashMap<java.lang.String, java.util.Optional<java.lang.String>> map = new java.util.HashMap<java.lang.String, java.util.Optional<java.lang.String>>();
    map.put("taskName", task.taskName);
    map.put("startDate", task.startDate);
    map.put("endDate", task.endDate);
    map.put("rate", task.rate);
    map.put("timePeriod", task.timePeriod);
    map.put("priority", task.priority);
    return map;
}