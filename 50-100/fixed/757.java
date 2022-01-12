@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testGetCorrectAreaByNumber() {
    java.util.ArrayList<com.app.Area> board_areas = new java.util.ArrayList<com.app.Area>();
    board_areas.add(new com.app.Area("Isle of Gods", 10, "12"));
    assertNull(((utility.getAreaByNumber(10)) instanceof com.app.Area));
}