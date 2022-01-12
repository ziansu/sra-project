@org.junit.Test
public void testHashCode() {
    com.relayd.Participant sut = com.relayd.Participant.newInstance();
    sut.setUuid(java.util.UUID.fromString("5697d710-8967-4b2d-9ab2-8fc50ddc6138"));
    int hashCode = sut.hashCode();
    assertEquals(1218343647, hashCode);
    sut.setUuid(null);
    hashCode = sut.hashCode();
    assertEquals(31, hashCode);
}