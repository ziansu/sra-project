private void popEntryBailout(org.glowroot.agent.model.TraceEntryImpl entry) {
    org.glowroot.agent.model.TraceEntryComponent.logger.error("found entry {} at top of stack when expecting entry {}", activeEntry, entry, new java.lang.Exception("location stack trace"));
    while ((((activeEntry) != null) && ((activeEntry) != (rootEntry))) && ((activeEntry) != entry)) {
        activeEntry = activeEntry.getParentTraceEntry();
    } 
}