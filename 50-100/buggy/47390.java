public java.lang.String get_identity(java.lang.String authtoken, java.lang.String authurl) throws org.json.simple.parser.ParseException {
    java.lang.String newurl1 = authurl.replace("tokens", "users");
    java.lang.String newurl = newurl1.replace("5000", "35357");
    java.lang.String jsonout;
    jsonout = rest_connector_get(authtoken, newurl);
    java.lang.System.out.println(jsonout);
    return jsonout;
}