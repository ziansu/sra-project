@org.junit.Test
public void withEndGreaterThanStringLength() {
    for (int i = 0; i < 10; i++) {
        final int end = (string.getCharacters().length) + i;
        final com.valkryst.VTerminal.misc.IntRange range = new com.valkryst.VTerminal.misc.IntRange(0, end);
        org.junit.Assert.assertFalse(string.isRangeValid(range));
    }
}