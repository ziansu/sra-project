private void changePartitions(java.lang.String topic, java.util.Map<java.lang.String, java.lang.Object> cuzQuota) throws com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.exception.OCKafkaException, java.lang.NumberFormatException {
    if (!(cuzQuota.containsKey(com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.impl.KafkaAdminService.Constants.TOPIC_QUOTA))) {
        return ;
    }
    java.lang.String par = ((java.lang.String) (cuzQuota.get(com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.impl.KafkaAdminService.Constants.TOPIC_QUOTA)));
    com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.client.KafkaClient.getClient().changePartitions(topic, java.lang.Integer.valueOf(par));
    com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.impl.KafkaAdminService.LOG.info("Kafka topic [{}]'s partition changed to [{}]", topic, par);
}