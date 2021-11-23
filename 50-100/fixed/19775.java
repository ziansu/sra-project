public static boolean ifOneAirlineandFlight(java.lang.String content) {
    int airlineCount = com.ticket.util.StringUtil.counter(content, "BOOKING REF");
    int flightCount = com.ticket.util.StringUtil.counterRegex(content, "[ ][A-Z]{2}[ ]\\d{1,4}");
    if ((airlineCount == 1) && (flightCount == 1)) {
        return true;
    }
    return false;
}