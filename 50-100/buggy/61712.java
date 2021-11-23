void checkAlternatives(java.util.List<com.graphhopper.routing.AlternativeRoute.AlternativeInfo> alternativeInfos) {
    for (com.graphhopper.routing.AlternativeRoute.AlternativeInfo a : alternativeInfos) {
        if ((a.getPlateauWeight()) > (a.getPath().getWeight()))
            org.junit.Assert.assertTrue(("plateau or sortby incorrect -> " + a), false);
        
    }
}