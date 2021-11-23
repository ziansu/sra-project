@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConstructorWithIllegalFirstName() {
    new de.vivistra.telegrambot.model.User(0, null, null, null);
}