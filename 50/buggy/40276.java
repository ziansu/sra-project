protected org.symphonyoss.integration.parser.SafeString getNextStepFormatted(com.fasterxml.jackson.databind.JsonNode node) {
    java.lang.String nextStep = getOptionalField(getNextStep(node), "-");
    if (org.apache.commons.lang3.StringUtils.isEmpty(nextStep)) {
        return org.symphonyoss.integration.parser.SafeString.EMPTY_SAFE_STRING;
    }
    return org.symphonyoss.integration.parser.ParserUtils.presentationFormat(org.symphonyoss.integration.webhook.salesforce.parser.BaseSalesforceParser.NEXT_STEP_FORMATTED, nextStep);
}