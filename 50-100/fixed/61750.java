@controller.RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
public controller.ResponseEntity<java.lang.Void> saveInformation_JSON(@controller.RequestBody
controller.User user) {
    boolean userAdded = loginService.addUser(user);
    if (userAdded) {
        return new controller.ResponseEntity<java.lang.Void>(HttpStatus.CREATED);
    }else {
        return new controller.ResponseEntity<java.lang.Void>(HttpStatus.BAD_REQUEST);
    }
}