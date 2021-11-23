@java.lang.Override
public org.jasig.cas.client.validation.TicketValidator build() {
    org.jasig.cas.client.validation.Cas30ServiceTicketValidator ticketValidator = new org.jasig.cas.client.validation.Cas30ServiceTicketValidator(casServerUrlPrefix);
    if ((proxyChainsValidation) != null) {
        logger.warn(com.kakawait.spring.boot.security.cas.CasTicketValidatorBuilder.Cas20ServiceTicketValidatorBuilder.OMISSION_MESSAGE_TEMPLATE, "proxyChainsValidation");
    }
    if ((proxyChains) != null) {
        logger.warn(com.kakawait.spring.boot.security.cas.CasTicketValidatorBuilder.Cas20ServiceTicketValidatorBuilder.OMISSION_MESSAGE_TEMPLATE, "proxyChains");
    }
    if ((allowEmptyProxyChain) != null) {
        logger.warn(com.kakawait.spring.boot.security.cas.CasTicketValidatorBuilder.Cas20ServiceTicketValidatorBuilder.OMISSION_MESSAGE_TEMPLATE, "allowEmptyProxyChain");
    }
    configure(ticketValidator);
    return ticketValidator;
}