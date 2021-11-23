@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/api/driver/trips")
@org.springframework.web.bind.annotation.ResponseBody
public it.smartcommunitylab.carpooling.model.Response<it.smartcommunitylab.carpooling.model.Travel> createTrips(@org.springframework.web.bind.annotation.RequestBody
it.smartcommunitylab.carpooling.model.Travel travel) throws it.smartcommunitylab.carpooling.exceptions.CarPoolingCustomException {
    return new it.smartcommunitylab.carpooling.model.Response<it.smartcommunitylab.carpooling.model.Travel>(carPoolingManager.saveTravel(travel, getUserId()));
}