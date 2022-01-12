@Test
public void save_assignsIdToObject() {
    Stylist myStylist = new Stylist("Stylist1", "employed here for 3 years");
    myStylist.save();
    Stylist savedStylist = Stylist.all().get(0);
    assertEquals(myStylist.getId(), savedStylist.getId());
}