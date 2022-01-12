@org.junit.Test
public void testEqualsWithValueIsNull() {
    com.relayd.Person dummyPerson = com.relayd.Person.newInstance();
    dummyPerson.setUuid(null);
    com.relayd.Participant sut = com.relayd.Participant.newInstance(dummyPerson);
    java.util.UUID uuidForSecondSut = java.util.UUID.randomUUID();
    dummyPerson.setUuid(uuidForSecondSut);
    com.relayd.Participant secondSut = com.relayd.Participant.newInstance(dummyPerson);
    boolean result = sut.equals(secondSut);
    assertFalse(result);
}