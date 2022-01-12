public void addLocation(java.lang.String latitude, java.lang.String longitude, java.lang.String c) {
    loc = new edu.ucla.cs144.Item.Location(latitude, longitude, c);
    java.lang.System.out.println(((latitude + longitude) + c));
}