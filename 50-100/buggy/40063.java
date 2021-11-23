private java.util.ArrayList<java.util.HashMap<java.lang.String, edu.uci.ics.sdcl.firefly.Microtask>> initializeSampledMaps(java.util.HashMap<java.lang.String, edu.uci.ics.sdcl.firefly.Microtask> microtaskMap) {
    java.util.ArrayList<java.util.HashMap<java.lang.String, edu.uci.ics.sdcl.firefly.Microtask>> sampleMapsList = new java.util.ArrayList<java.util.HashMap<java.lang.String, edu.uci.ics.sdcl.firefly.Microtask>>();
    for (int i = 0; i < (numberOfSamples); i++) {
        java.util.HashMap<java.lang.String, edu.uci.ics.sdcl.firefly.Microtask> sampleMicrotaskMap = this.cloneMap(microtaskMap);
        sampleMapsList.add(sampleMicrotaskMap);
    }
    return sampleMapsList;
}