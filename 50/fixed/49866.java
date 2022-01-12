public static boolean isPersonBelongsToCommuter(org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person> personId) {
    if (java.util.Arrays.asList(personId.toString().split("_")).contains("E2I"))
        return true;
    else
        return false;
    
}