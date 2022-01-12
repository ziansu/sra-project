protected com.graphhopper.PathWrapper doInBackground(java.lang.Void... v) {
    com.graphhopper.util.StopWatch sw = new com.graphhopper.util.StopWatch().start();
    com.graphhopper.GHRequest req = new com.graphhopper.GHRequest(fromLat, fromLon, toLat, toLon).setAlgorithm(Algorithms.DIJKSTRA_BI);
    req.getHints().put(Routing.INSTRUCTIONS, "false");
    com.graphhopper.GHResponse resp = hopper.route(req);
    time = sw.stop().getSeconds();
    return resp.getBest();
}