private java.lang.String retrieveUserId(java.lang.String universalId) {
    java.util.StringTokenizer str = new java.util.StringTokenizer(universalId, "=,");
    java.lang.String userId = "";
    while (str.hasMoreTokens()) {
        java.lang.String key = str.nextToken();
        java.lang.String value = str.nextToken();
        if (key.equalsIgnoreCase("id")) {
            userId = value;
        }
    } 
    java.lang.System.out.println(("userId : " + userId));
    return userId;
}