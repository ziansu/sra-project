public static java.lang.String getNeo4jPassword() {
    java.lang.String pw = java.lang.System.getenv("NEO4J_PASSWORD");
    return (pw == null) || (pw.isEmpty()) ? dbservice.Util.DEFAULT_PW : pw;
}