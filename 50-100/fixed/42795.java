@org.junit.Test
public void testEqualsWithBothValuesAreNull() {
    com.relayd.Person dummyPerson = com.relayd.Person.newInstance();
    com.relayd.Participant sut = com.relayd.Participant.newInstance(dummyPerson);
    sut.setUuid(null);
    com.relayd.Participant secondSut = com.relayd.Participant.newInstance(dummyPerson);
    secondSut.setUuid(null);
    boolean result = sut.equals(secondSut);
    assertTrue(result);
}