@org.junit.Before
public void setUp() {
    jim = new ContactImpl(1, "Jim", "test");
    ben = new ContactImpl(2, "Ben", "test2");
    meetingContacts = new java.util.HashSet<>();
    meetingContacts.add(jim);
    meetingContacts.add(ben);
    testDate = new java.util.GregorianCalendar(2015, 2, 10);
    testMeeting = new FutureMeetingImpl(5, testDate, meetingContacts);
}