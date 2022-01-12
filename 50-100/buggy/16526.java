@org.junit.Test
public void testRepeatStringXTimes() throws java.lang.Exception {
    assertEqual(nyc.c4q.Unit0Tests.repeatStringXTimes("foo", 20), "foofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoo");
    assertEqual(nyc.c4q.Unit0Tests.repeatStringXTimes("potato", 5), "potatopotatopotatopotatopotato");
    assertEqual(nyc.c4q.Unit0Tests.repeatStringXTimes("pumpkin", (-1)), "");
}