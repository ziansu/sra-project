private void initSysProperties() {
    if (!(com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.client.KafkaClient.getClient().isSecure())) {
        com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.impl.KafkaAdminService.LOG.info("Kerbros not enabled. Skipping JVM System-Properties-Settings of [krb5.conf, jaas].");
        return ;
    }
    java.lang.System.setProperty("java.security.krb5.conf", this.sys_env.getKrb5FilePath());
    java.lang.System.setProperty("java.security.auth.login.config", this.sys_env.getKafka_jaas_path());
    com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.impl.KafkaAdminService.LOG.info("Krb conf and Jaas files been set to {}, {}", this.sys_env.getKrb5FilePath(), this.sys_env.getKafka_jaas_path());
}