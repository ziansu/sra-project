public void handleLogIn(java.lang.String username, java.lang.String password) {
    app.model.User user;
    try {
        user = loginfacade.handleLogIn(username, password);
        java.lang.System.out.print(user);
        setUser(user);
        if (user instanceof app.model.Customer) {
            this.goTo("home");
        }else {
            this.goTo("notifications");
        }
    } catch (java.lang.Exception e) {
        UI.views.ViewLogIn myView = new UI.views.ViewLogIn(this);
        myView.displayErrors(e.getMessage());
        this.render(myView);
    }
}