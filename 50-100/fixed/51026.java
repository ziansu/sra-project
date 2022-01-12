private static void geoStream(double[][] filters, java.lang.String name) {
    java.lang.Runnable stream = new SocialNetworkAnalysis.Applications.GeoStream(filters, SocialNetworkAnalysis.Applications.FranceStreams.getFig(), name, true);
    new java.lang.Thread(stream, name).start();
    SocialNetworkAnalysis.Applications.FranceStreams.sleep();
}