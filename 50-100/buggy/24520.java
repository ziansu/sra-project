private java.lang.String checkPrimaryKey() {
    if (checkTokenIgnoreCase("primary", false)) {
        checkTokenIgnoreCase("primary", true);
        if (checkTokenIgnoreCase("key", true)) {
            return "PRIMARY";
        }else {
            java.lang.System.err.println("KEY keyword expected after PRIMARY");
            return "ERROR";
        }
    }else {
        return "";
    }
}