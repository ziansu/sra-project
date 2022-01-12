public static java.util.ArrayList<Place> makePlace(long mount) {
    java.util.ArrayList<Place> p_arr = new java.util.ArrayList<>();
    long count = 0;
    while ((++count) <= mount) {
        double lon = ((java.lang.Math.random()) * 4) + 118;
        double lat = ((java.lang.Math.random()) * 3) + 23;
        p_arr.add(new Place(("p" + count), lat, lon));
    } 
    return p_arr;
}