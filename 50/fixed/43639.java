@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConstructorWithIllegalFirstName() {
    new de.vivistra.telegrambot.model.User(0L, null, null, null);
}