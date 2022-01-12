@org.junit.Test
public void testColSizeAfterHit() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    g.cols.add(new java.util.ArrayList<models.Card>());
    u.hit(0);
    assertEquals(1, g.cols.get(0).size());
}