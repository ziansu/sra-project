boolean isSubset(java.util.List<org.universAAL.middleware.rdf.Resource> matchl) {
    for (java.lang.Object m : matchl) {
        if ((m instanceof org.universAAL.middleware.bus.model.matchable.Matchable) && (!(isMember(((org.universAAL.middleware.bus.model.matchable.Matchable) (m)))))) {
            return false;
        }
    }
    return true;
}