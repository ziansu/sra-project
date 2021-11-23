public static java.lang.String produceReason(java.lang.String[] args) {
    java.lang.String reason = "";
    for (int i = 2; i < (args.length); i++) {
        reason = ((i + 1) == (args.length)) ? reason + (args[i]) : (reason + (args[i])) + " ";
    }
    return reason;
}