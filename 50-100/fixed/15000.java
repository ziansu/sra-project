protected void doWinsultRequest(java.util.Map<java.lang.String, java.lang.String> messageMap, com.derpgroup.derpwizard.voice.model.SsmlDocumentBuilder builder, com.derpgroup.quip.QuipMetadata metadata) {
    com.derpgroup.quip.manager.QuipManager.Winsults winsult = com.derpgroup.quip.manager.QuipManager.Winsults.getRandomWinsults();
    metadata.getWinsultsUsed().add(winsult.name());
    builder.text(winsult.getWinsult());
}