private static com.xrtb.tools.GeoStuff randomGeo() {
    com.xrtb.tools.GeoStuff q = null;
    java.util.Random rand = new java.util.Random();
    int Low = 0;
    int High = com.xrtb.tools.ElasticLoader.geo.size();
    int Result = (rand.nextInt((High - Low))) + Low;
    return com.xrtb.tools.ElasticLoader.geo.get(Result);
}