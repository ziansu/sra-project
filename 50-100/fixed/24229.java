@org.junit.Test
public void upsert() {
    demo.Broker broker = new demo.Broker();
    broker.setId(11L);
    broker.setAccountName("accountName");
    broker.setBrokerNumber("brokerNumber1");
    broker.setBirthdate(new java.sql.Date(new java.util.Date().getTime()));
    broker.setEmail("email");
    service.upsert(broker, "i");
}