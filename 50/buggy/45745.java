public play.mvc.Result logout() {
    if (play.mvc.Controller.session("google").equals("true")) {
    }
    play.mvc.Controller.session().clear();
    return controllers.AuthenticationController.GO_HOME;
}