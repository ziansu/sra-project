@org.junit.Test
public void testUpdateWatchers() {
    java.util.List<se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.Accommodation> accommodationList1 = new java.util.ArrayList<>();
    se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.Accommodation accommodation1 = new se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.Accommodation("", "", se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.AccommodationHouseType.COOKING_CABINET, 0, 0, 100, "", "", se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.AccommodationHost.CHALMERS, se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.Region.CENTER, "", "", false);
    accommodationList1.add(accommodation1);
    assertTrue(((se.chalmers.projektgrupplp4.studentlivinggbg.model.searchwatcher.SearchWatcherModel.updateWatchers(accommodationList1)) == 1));
}