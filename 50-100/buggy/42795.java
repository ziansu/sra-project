@org.junit.Test
public void testEqualsWithBothValuesAreNull() {
    com.relayd.Person dummyPerson = com.relayd.Person.newInstance();
    dummyPerson.setUuid(null);
    com.relayd.Participant sut = com.relayd.Participant.newInstance(dummyPerson);
    com.relayd.Participant secondSut = com.relayd.Participant.newInstance(dummyPerson);
    boolean result = sut.equals(secondSut);
    assertTrue(result);
}