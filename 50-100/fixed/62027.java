@org.junit.Test
public void testEqualsWithValueIsNull() {
    com.relayd.Person dummyPerson = com.relayd.Person.newInstance();
    com.relayd.Participant sut = com.relayd.Participant.newInstance(dummyPerson);
    sut.setUuid(null);
    java.util.UUID uuidForSecondSut = java.util.UUID.randomUUID();
    com.relayd.Participant secondSut = com.relayd.Participant.newInstance(dummyPerson);
    secondSut.setUuid(uuidForSecondSut);
    boolean result = sut.equals(secondSut);
    assertFalse(result);
}