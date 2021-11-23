@org.springframework.web.bind.annotation.RequestMapping(value = "/user/save", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
org.springframework.http.ResponseEntity<lt.msi2015.user.User> save(@org.springframework.web.bind.annotation.RequestBody
lt.msi2015.user.UserDto info) {
    if (userService.userExists()) {
        return new org.springframework.http.ResponseEntity(null, org.springframework.http.HttpStatus.BAD_REQUEST);
    }
    int monthlyLimit = appSettingsService.getSetting(ApplicationSettingsEnum.MONTHLY_LIMIT).getValue();
    repo.save(new lt.msi2015.user.User(info.email, info.firstName, info.lastName, info.password, monthlyLimit));
    return new org.springframework.http.ResponseEntity(null, org.springframework.http.HttpStatus.OK);
}