private void compareLocation(cz.fi.muni.pa165.mushroomhunter.entity.Location oldLocation, cz.fi.muni.pa165.mushroomhunter.entity.Location newLocation) {
    assertEquals(oldLocation.getName(), newLocation.getName());
    assertEquals(oldLocation.getDescription(), newLocation.getDescription());
    assertEquals(oldLocation.getNearCity(), newLocation.getNearCity());
}