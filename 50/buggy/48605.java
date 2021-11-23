public static void main(java.lang.String[] args) throws java.lang.Exception {
    final eu.europeana.harvester.cluster.Slave slave = new eu.europeana.harvester.cluster.Slave(args);
    slave.init(slave);
    slave.start();
}