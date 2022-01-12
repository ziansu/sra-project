public java.lang.String getCommandType(java.lang.String args) {
    if ((args.contains("s/")) && (args.contains("e/"))) {
        return "event";
    }else {
        if (args.contains("e/")) {
            return "task";
        }
        return "floating";
    }
}