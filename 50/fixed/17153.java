@org.junit.Test
public void getId_whenCalled_returnsId() {
    nl.jft.logic.participant.Title title = nl.jft.logic.util.LogicTestUtil.makeDefaultTitle();
    int expected = -1;
    int actual = title.getId();
    assertEquals(expected, actual);
}