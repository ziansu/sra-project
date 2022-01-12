@com.flights.user.controller.RequestMapping(value = "/updateinfo", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity updateInfo(@com.flights.user.controller.RequestBody
com.flights.user.pojo.UserChangeInfoRequest request) {
    return userService.changeUserAdditionalInfo(request);
}