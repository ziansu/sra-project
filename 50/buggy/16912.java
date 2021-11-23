@com.flights.user.controller.RequestMapping(value = "/register", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity<com.flights.user.pojo.UserRegisterResponse> register(@com.flights.user.controller.RequestBody
com.flights.user.pojo.UserRegisterRequest request) {
    com.flights.user.pojo.UserRegisterResponse response = userService.create(request);
    return new org.springframework.http.ResponseEntity(response, org.springframework.http.HttpStatus.OK);
}