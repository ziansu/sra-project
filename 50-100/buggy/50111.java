public static java.lang.String north(java.lang.String south) {
    java.util.List<java.lang.String> stations = user.Stations.getStations();
    int index = stations.indexOf(south);
    if (index > 1) {
        return stations.get((index - 1));
    }else {
        return "" + ((java.lang.Integer.valueOf(south)) + 1);
    }
}