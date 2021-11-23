@org.springframework.cloud.context.config.annotation.RefreshScope
@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.View casOpenIdAssociationSuccessView() {
    return new org.apereo.cas.web.view.CasProtocolView("protocol/openid/casOpenIdAssociationSuccessView", this.applicationContext, this.springTemplateEngine, this.properties);
}