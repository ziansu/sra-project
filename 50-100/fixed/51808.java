@java.lang.Override
public java.util.Map runCommand(java.lang.String commandName, java.util.List<org.apache.http.NameValuePair> params, com.fasterxml.jackson.core.type.TypeReference typeReference) {
    try {
        return objectMapper.readValue(tradingAPIClient.returnTradingAPICommandResults(commandName, params), typeReference);
    } catch (java.io.IOException e) {
        com.habanoz.polbot.core.api.PoloniexTradingApiImpl.logger.error("Error while running command {}", commandName, e);
        return java.util.Collections.emptyMap();
    }
}