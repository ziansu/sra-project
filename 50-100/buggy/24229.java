@org.junit.Test
public void upsert() {
    demo.Broker broker = new demo.Broker();
    broker.setId(11L);
    broker.setAccountName("accountName");
    broker.setBrokerNumber("brokerNumber1");
    broker.setBirthdate(java.sql.Date.valueOf(java.time.LocalDate.now()));
    broker.setEmail("email");
    service.upsert(broker, "i");
}