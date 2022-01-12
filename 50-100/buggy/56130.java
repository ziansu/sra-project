@java.lang.Override
public java.lang.String updateVenue(java.lang.Long venue_ID, java.lang.String updatedVenue) {
    com.qa.cinema.persistence.Venue updateVenue = util.getObjectForJSON(updatedVenue, com.qa.cinema.persistence.Venue.class);
    com.qa.cinema.persistence.Venue venue = findVenue(java.lang.Long.valueOf(venue_ID));
    java.lang.Long temp_ID = venue.getVenue_ID();
    if (venue != null) {
        venue = updateVenue;
        venue.setVenue_ID(temp_ID);
        em.merge(venue);
    }
    return "{\"message\": \"venue has been successfully updated\"}";
}