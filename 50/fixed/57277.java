public io.evercam.Right getRights() {
    java.lang.String rightsString = jsonObject.getString("rights");
    return new io.evercam.Right(rightsString);
}