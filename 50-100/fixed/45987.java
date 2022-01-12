protected java.util.ArrayList getAreaTakeoverPaths(int[] countryList, int startCountry) {
    testChat("getAreaTakeoverPaths", "-- GET AREA TAKEOVER PATHS --");
    testChat("getAreaTakeoverPaths", ("startCountry is " + startCountry));
    java.util.ArrayList<int[]> paths = new java.util.ArrayList<int[]>();
    int[] initialPath = new int[1];
    initialPath[0] = startCountry;
    paths = findAreaPaths(initialPath, countryList);
    return paths;
}