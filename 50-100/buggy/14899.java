public Response.RegisterResponse register(com.CommandClasses.Register register) {
    if (users.containsKey(register.getUsername())) {
        return new Response.RegisterResponse(null, "Username is already taken");
    }else {
        Model.User u = new Model.User(register);
        u.createKey();
        users.put(register.getUsername(), u);
        return new Response.RegisterResponse(u, null);
    }
}