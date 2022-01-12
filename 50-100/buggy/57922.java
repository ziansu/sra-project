private java.lang.String addAllLocations(java.util.ArrayList<java.lang.String> rooms) {
    java.lang.String result = "";
    for (java.lang.String room : rooms) {
        result = (result + room) + "\\, ";
    }
    return result.substring(0, ((result.length()) - 3));
}