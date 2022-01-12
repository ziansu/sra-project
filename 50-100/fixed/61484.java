@java.lang.Override
public java.util.List<com.pmc.model.Zone> getZones(double latitude, double longitude, int radius) {
    org.joda.time.DateTime oldestDate = new org.joda.time.DateTime().plusMinutes((-(com.pmc.service.ZoneServiceImpl.TIMELAPS_MINUTE)));
    return zoneDAO.findZonesByPosition(latitude, longitude, oldestDate, radius);
}