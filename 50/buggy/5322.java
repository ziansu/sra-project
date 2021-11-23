@java.lang.Override
public void createList(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.dsbenchmark.rev150105.StartTestInput input) {
    org.opendaylight.dsbenchmark.DatastoreBaDelete.LOG.info("DatastoreDelete: creating data in the data store");
    org.opendaylight.dsbenchmark.DatastoreBaDump dd = new org.opendaylight.dsbenchmark.DatastoreBaDump(input, dataBroker);
    dd.writeList();
}