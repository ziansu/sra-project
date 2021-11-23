@org.junit.Test
public void getDescription_whenCalled_returnsDescription() {
    nl.jft.logic.participant.Title title = nl.jft.logic.util.LogicTestUtil.makeDefaultTitle();
    java.lang.String expected = "description";
    java.lang.String actual = title.getDescription();
    assertEquals(expected, actual);
}