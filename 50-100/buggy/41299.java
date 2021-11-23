public void accept(com.fasterxml.jackson.databind.JsonNode utlatande, com.fasterxml.jackson.databind.JsonNode hsa, long logId, java.lang.String correlationId, se.inera.statistics.service.processlog.EventType type) {
    com.fasterxml.jackson.databind.node.ObjectNode preparedDoc = se.inera.statistics.service.helper.DocumentHelper.prepare(utlatande);
    vardgivareManager.saveEnhet(hsa);
    lakareManager.saveLakare(hsa);
    widelineManager.accept(preparedDoc, hsa, logId, correlationId, type);
    (processedCounter)++;
}