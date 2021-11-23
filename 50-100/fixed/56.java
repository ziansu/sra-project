@org.junit.BeforeClass
public static void buildUp() {
    MeetingShould.contacts = new java.util.HashSet<>();
    MeetingShould.contacts.add(new ContactImpl(1, "Sam", "Not nice"));
    MeetingShould.contacts.add(new ContactImpl(2, "Jenna"));
    MeetingShould.contacts.add(new ContactImpl(3, "Arthur"));
    MeetingShould.contacts.add(new ContactImpl(4, "Annie", "Oranges"));
}