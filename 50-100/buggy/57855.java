@java.lang.Override
public org.jasig.cas.client.validation.TicketValidator build() {
    org.jasig.cas.client.validation.Cas20ProxyTicketValidator ticketValidator = new org.jasig.cas.client.validation.Cas20ProxyTicketValidator(casServerUrlPrefix);
    configure(ticketValidator);
    if ((proxyChainsValidation) != null) {
        ticketValidator.setAcceptAnyProxy((!(proxyChainsValidation)));
    }
    if ((allowEmptyProxyChain) != null) {
        ticketValidator.setAllowEmptyProxyChain(allowEmptyProxyChain);
    }
    if ((proxyChains) != null) {
        ticketValidator.setAllowedProxyChains(proxyChains);
    }
    return ticketValidator;
}