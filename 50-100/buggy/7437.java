public java.lang.Iterable<org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person>> cat(final org.matsim.api.core.v01.Id ego, final java.util.Set<org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person>> alters) {
    final java.util.Set<org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person>> ids = new java.util.HashSet(alters);
    ids.add(ego);
    return ids;
}