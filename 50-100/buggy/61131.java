public org.json.simple.JSONObject logUser(org.json.simple.JSONObject object) {
    javax.servlet.http.HttpSession session = getSession();
    session.setAttribute("user", object);
    org.json.simple.JSONObject storedUser = ((org.json.simple.JSONObject) (session.getAttribute("user")));
    java.lang.System.out.println(("session login>>>" + session));
    java.lang.System.out.println(("---session login user>>>" + storedUser));
    return storedUser;
}