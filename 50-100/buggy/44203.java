@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    java.util.HashMap<java.lang.String, java.lang.String> directionsList = null;
    com.creativeminds.stealthpatrolling.DataParser parser = new com.creativeminds.stealthpatrolling.DataParser();
    directionsList = parser.parseDirections(s);
    duration = directionsList.get("duration");
    distance = directionsList.get("distance");
    gMap.clear();
    java.lang.System.out.println(((("the duration is " + (duration)) + "and the distance is ") + (distance)));
}