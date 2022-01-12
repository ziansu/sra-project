@org.springframework.context.annotation.Bean
public org.springframework.social.connect.web.ConnectController connectController(org.springframework.social.connect.ConnectionFactoryLocator connectionFactoryLocator, org.springframework.social.connect.ConnectionRepository connectionRepository) {
    return new io.getlime.security.powerauth.app.webflow.demo.controller.CustomConnectController(connectionFactoryLocator, connectionRepository);
}