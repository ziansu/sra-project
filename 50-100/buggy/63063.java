public java.lang.String getCommandType() {
    boolean starttime = false;
    boolean endtime = false;
    for (seedu.address.logic.parser.ArgumentTokenizer.Prefix prefix : prefixes) {
        if (prefix.getPrefix().equals("s/")) {
            starttime = true;
        }
        if (prefix.getPrefix().equals("e/")) {
            endtime = true;
        }
    }
    if (starttime && endtime) {
        return "event";
    }else {
        if (endtime) {
            return "task";
        }
        return "floating";
    }
}