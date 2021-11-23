public static boolean isKey(java.lang.String aInKey) {
    return SessionTransactions.currentEventsMap.containsKey(aInKey.replace(" ", Constants.SPACE));
}