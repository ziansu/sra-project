@java.lang.Override
public cabanas.garcia.ismael.opportunity.view.View process(cabanas.garcia.ismael.opportunity.http.Request request) {
    java.lang.String username = extractUsernameFromRequestPath(request.getPath());
    java.util.Optional<cabanas.garcia.ismael.opportunity.model.User> existentUser = userService.findByUsername(username);
    if (existentUser.isPresent()) {
        userService.delete(username);
        return new cabanas.garcia.ismael.opportunity.view.UserGetView(existentUser.get());
    }else {
        return new cabanas.garcia.ismael.opportunity.view.ResourceNotFoundView();
    }
}