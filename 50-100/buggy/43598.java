@org.springframework.beans.factory.annotation.Autowired
@org.springframework.context.annotation.Bean
@org.springframework.cloud.context.config.annotation.RefreshScope
public org.apereo.cas.web.support.CookieRetrievingCookieGenerator ticketGrantingTicketCookieGenerator(@org.springframework.beans.factory.annotation.Qualifier(value = "cookieCipherExecutor")
final org.apereo.cas.CipherExecutor cipherExecutor) {
    final org.apereo.cas.configuration.model.support.cookie.TicketGrantingCookieProperties tgc = casProperties.getTgc();
    final int rememberMeMaxAge = java.lang.Long.valueOf(tgc.getRememberMeMaxAge()).intValue();
    return new org.apereo.cas.web.support.TGCCookieRetrievingCookieGenerator(defaultCookieValueManager(cipherExecutor), tgc.getName(), tgc.getPath(), tgc.getDomain(), tgc.getMaxAge(), tgc.isSecure(), rememberMeMaxAge);
}