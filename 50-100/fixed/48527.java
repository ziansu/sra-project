@java.lang.SuppressWarnings(value = "unchecked")
public synchronized void login(java.lang.String username, java.lang.String password, java.lang.String language) throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.String> response = ((java.util.Map<java.lang.String, java.lang.String>) (invoke("LogIn", new java.lang.Object[]{ username , password , language , getUserAgent() })));
    setToken(response.get("token"));
}