public static boolean isPersonBelongsToCommuter(org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person> personId) {
    if (personId.toString().split("_")[1].equals("E2I"))
        return true;
    else
        return false;
    
}