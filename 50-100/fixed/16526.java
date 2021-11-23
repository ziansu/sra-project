@org.junit.Test
public void testRepeatStringXTimes() throws java.lang.Exception {
    assertEquals(nyc.c4q.Unit0Tests.repeatStringXTimes("foo", 20), "foofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoo");
    assertEquals(nyc.c4q.Unit0Tests.repeatStringXTimes("potato", 5), "potatopotatopotatopotatopotato");
    assertEquals(nyc.c4q.Unit0Tests.repeatStringXTimes("pumpkin", (-1)), "");
}