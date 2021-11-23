public java.lang.String authorLogin() {
    return comment.getJsonObject("user").getString("login");
}