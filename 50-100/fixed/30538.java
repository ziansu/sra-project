public Response.LoginResponse login(com.CommandClasses.Login login) {
    if ((users) != null) {
        if (users.containsKey(login.getUsername())) {
            Model.User u = users.get(login.getUsername());
            if (u.getPassword().contentEquals(login.getPassword())) {
                return new Response.LoginResponse(u, null);
            }
        }
    }
    return new Response.LoginResponse(null, "Incorrect Login Credentials");
}