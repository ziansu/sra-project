private void init(java.lang.String[] args) throws java.lang.Exception {
    org.cripac.isee.vpe.ctrl.SystemPropertyCenter propCenter;
    if ((args.length) > 0) {
        propCenter = new org.cripac.isee.vpe.ctrl.SystemPropertyCenter(args);
    }else {
        propCenter = new org.cripac.isee.vpe.ctrl.SystemPropertyCenter();
    }
    java.util.Properties producerProp = propCenter.getKafkaProducerProp(false);
    producer = new org.apache.kafka.clients.producer.KafkaProducer(producerProp);
    logger = new org.cripac.isee.vpe.util.logging.ConsoleLogger(org.apache.log4j.Level.DEBUG);
}