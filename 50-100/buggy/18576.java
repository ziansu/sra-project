public static boolean hasGenerators(java.util.HashMap<java.lang.String, java.lang.Object> dome) {
    if (dome.containsKey("generators")) {
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> rules = ((java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>) (dome.get("generators")));
        if (rules == null) {
            return false;
        }
        if ((rules.size()) == 0) {
            return false;
        }else {
            return true;
        }
    }else {
        return false;
    }
}