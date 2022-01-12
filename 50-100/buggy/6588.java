private eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusTypeType calculateMessageValidationStatus(eu.europa.ec.fisheries.uvms.rules.model.dto.ValidationResultDto validationResult) {
    if ((faReportValidationResult) != null) {
        if (validationResult.isError()) {
            return eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusTypeType.FAILED;
        }else
            if (validationResult.isWarning()) {
                return eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusTypeType.SUCCESSFUL_WITH_WARNINGS;
            }else {
                return eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusTypeType.SUCCESSFUL;
            }
        
    }else {
        return eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusTypeType.UNKNOWN;
    }
}