@jello.security.Accessible(value = jello.security.Role.USER)
@java.lang.SuppressWarnings(value = "unchecked")
public void book() throws jello.rest.IllegalRequestResource {
    app.Booking b = new app.Booking();
    b.product = this.getKey();
    com.google.appengine.api.users.UserService userService = com.google.appengine.api.users.UserServiceFactory.getUserService();
    if (userService.isUserLoggedIn()) {
        b.userId = userService.getCurrentUser().getEmail();
    }
    b.cost = this.cost;
    b.create();
}