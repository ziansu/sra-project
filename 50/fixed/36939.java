@org.springframework.web.bind.annotation.RequestMapping(value = "/review/{locationId}")
public java.lang.Iterable<obscureTravel.Review> showReviewByLocation(@org.springframework.web.bind.annotation.PathVariable
obscureTravel.Location location, java.lang.Long locationId) {
    locationId = location.getId();
    return null;
}