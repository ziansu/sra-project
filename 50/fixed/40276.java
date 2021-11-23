protected org.symphonyoss.integration.parser.SafeString getNextStepFormatted(com.fasterxml.jackson.databind.JsonNode node) {
    java.lang.String nextStep = getOptionalField(getNextStep(node), "-");
    return org.symphonyoss.integration.parser.ParserUtils.presentationFormat(org.symphonyoss.integration.webhook.salesforce.parser.BaseSalesforceParser.NEXT_STEP_FORMATTED, nextStep);
}