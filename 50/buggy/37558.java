private static void updateDistance(MAIN.Location.Distance finalDistance, MAIN.Location.Distance currDistance) {
    if ((finalDistance.compareTo(currDistance)) > 0) {
        finalDistance = currDistance;
    }
}