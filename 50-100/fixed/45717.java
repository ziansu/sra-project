@ru.moneymanager.web.RESTControllers.RequestMapping(method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<java.util.List<ru.moneymanager.web.beans.User>> listAllUsers() {
    java.util.List<ru.moneymanager.web.beans.User> users = userService.getAllUser();
    if (users.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity(users, org.springframework.http.HttpStatus.OK);
}