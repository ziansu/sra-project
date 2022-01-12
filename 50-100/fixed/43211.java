@org.junit.Test
public void testGetShiftsEmptyLine() {
    CS3213.WordsToIgnore wordsToIgnore = CS3213.WordsToIgnore.create();
    CS3213.CircularShift circularShift = CS3213.CircularShift.create(wordsToIgnore);
    java.util.List<java.lang.String> shifts = circularShift.getShifts("");
    assertTrue((shifts != null));
    assertTrue(((shifts.size()) == 1));
    assertTrue(shifts.contains(""));
}