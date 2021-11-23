@Test
public void save_assignsIdToObject() {
    Stylist firstStylist = new Stylist("Stylist1", "employed here for 3 years");
    firstStylist.save();
    Stylist savedStylist = Stylist.all().get(0);
    assertEquals(myStylist.getId(), savedStylist.getId());
}