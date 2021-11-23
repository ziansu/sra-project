@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/api/passenger/trips/{tripId}/book")
@org.springframework.web.bind.annotation.ResponseBody
public it.smartcommunitylab.carpooling.model.Response<it.smartcommunitylab.carpooling.model.Travel> bookTrip(@org.springframework.web.bind.annotation.PathVariable
java.lang.String tripId, @org.springframework.web.bind.annotation.RequestBody
it.smartcommunitylab.carpooling.model.Booking booking) throws it.smartcommunitylab.carpooling.exceptions.CarPoolingCustomException {
    it.smartcommunitylab.carpooling.model.Travel travel = carPoolingManager.bookTrip(tripId, booking, getUserId());
    return new it.smartcommunitylab.carpooling.model.Response<it.smartcommunitylab.carpooling.model.Travel>(travel);
}