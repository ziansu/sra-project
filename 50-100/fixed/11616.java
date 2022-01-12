@com.codecool.neighbrotaxi.controller.RequestMapping(value = "/logged-in-user", method = RequestMethod.GET)
public java.lang.Object loggedInUser() {
    sessionStorage.clearAllErrorMessages();
    sessionStorage.clearAllInfoMessages();
    if (java.util.Objects.equals(sessionStorage.getLoggedInUser().getName(), "anonymous")) {
        sessionStorage.addErrorMessage("Nobody is logged in!");
        return new com.codecool.neighbrotaxi.model.SerializableSessionStorage(sessionStorage);
    }else {
        sessionStorage.setLoggedInUser(userService.findByUsername(sessionStorage.getLoggedInUser().getUsername()));
    }
    return sessionStorage.getLoggedInUser();
}