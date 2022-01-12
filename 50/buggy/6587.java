@org.springframework.cloud.context.config.annotation.RefreshScope
@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.View cas2ServiceFailureView() {
    return new org.apereo.cas.web.view.CasProtocolView(casProperties.getView().getCas2().getFailure(), this.applicationContext, this.springTemplateEngine, this.properties);
}