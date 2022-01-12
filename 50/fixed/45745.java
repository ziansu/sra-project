public play.mvc.Result logout() {
    play.mvc.Controller.session().clear();
    return controllers.AuthenticationController.GO_HOME;
}