@org.junit.Test
public void testHashCode() {
    com.relayd.Person person = com.relayd.Person.newInstance();
    person.setUuid(java.util.UUID.fromString("5697d710-8967-4b2d-9ab2-8fc50ddc6138"));
    com.relayd.Participant sut = com.relayd.Participant.newInstance(person);
    int hashCode = sut.hashCode();
    assertEquals(1218343647, hashCode);
    com.relayd.Participant sutWithoutUUID = com.relayd.Participant.newInstance();
    hashCode = sutWithoutUUID.hashCode();
    assertEquals(31, hashCode);
}