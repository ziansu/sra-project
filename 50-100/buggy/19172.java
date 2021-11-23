protected void recordAudit(com.northernwall.hadrian.domain.WorkItem workItem, com.northernwall.hadrian.workItem.Result result, java.lang.String output) {
    java.util.Map<java.lang.String, java.lang.String> notes = new java.util.HashMap<>();
    notes.put("Template", workItem.getMainModule().template);
    notes.put("Type", workItem.getMainModule().moduleType.toString());
    recordAudit(workItem, result, notes, null);
}