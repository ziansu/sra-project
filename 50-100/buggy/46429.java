@org.springframework.context.annotation.Bean
@org.springframework.cloud.context.config.annotation.RefreshScope
public org.apereo.cas.CipherExecutor<byte[], byte[]> webflowCipherExecutor() {
    final org.apereo.cas.configuration.model.webapp.WebflowProperties webflow = casProperties.getWebflow();
    return new org.apereo.cas.util.cipher.WebflowConversationStateCipherExecutor(webflow.getCrypto().getEncryption().getKey(), webflow.getCrypto().getSigning().getKey(), webflow.getCrypto().getAlg(), webflow.getCrypto().getSigning().getKeySize(), webflow.getCrypto().getSigning().getKeySize());
}