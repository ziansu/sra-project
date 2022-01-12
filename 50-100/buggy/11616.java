@com.codecool.neighbrotaxi.controller.RequestMapping(value = "/logged-in-user", method = RequestMethod.GET)
public com.codecool.neighbrotaxi.model.SerializableSessionStorage loggedInUser() {
    sessionStorage.clearAllErrorMessages();
    sessionStorage.clearAllInfoMessages();
    if (java.util.Objects.equals(sessionStorage.getLoggedInUser().getName(), "anonymous")) {
        sessionStorage.addErrorMessage("Nobody is logged in!");
    }else {
        sessionStorage.setLoggedInUser(userService.findByUsername(sessionStorage.getLoggedInUser().getUsername()));
    }
    return new com.codecool.neighbrotaxi.model.SerializableSessionStorage(sessionStorage);
}