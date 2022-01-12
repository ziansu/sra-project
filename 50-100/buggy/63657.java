private static boolean validateData(java.lang.String name, java.lang.String lattitude, java.lang.String longitude, java.lang.String description, java.lang.String category) {
    if (((((name != null) && (lattitude != null)) && (longitude != null)) && (description != null)) && (category != null)) {
        if (!(com.springframework.functionality.DestinationsManager.getInstance().chechDestinationInCache(name))) {
            return true;
        }
    }
    return false;
}