@org.junit.Test
public void testAddNewRunCurrentRun() {
    console.Power();
    assertTrue(console.newRun());
    assertFalse(console.newRun());
}