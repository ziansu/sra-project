private java.lang.String checkPrimaryKey() {
    if (checkTokenIgnoreCase("primary", false)) {
        checkTokenIgnoreCase("primary", true);
        if (checkTokenIgnoreCase("key", true)) {
            return "PRIMARY";
        }else {
            java.lang.System.out.println("KEY keyword expected after PRIMARY");
            return null;
        }
    }else {
        return "";
    }
}