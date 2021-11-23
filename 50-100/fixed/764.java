protected void debug_update(java.lang.String stmt, java.lang.Object... args) {
    if (DebugUtils.canDebug(getClass(), DBConnector.class, DBConnector.DebugFlag.UPDATES)) {
        DebugUtils.printDebugInfo(("Executing update:\n   " + (Utils.wrapString(Utils.replaceEach(stmt, "?", "arg:'%s'", args), 50, "\n   "))), getClass(), DBConnector.class, false, DBConnector.DebugFlag.UPDATES);
    }
}