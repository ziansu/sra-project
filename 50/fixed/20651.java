public static boolean isPersonFromSlum(final org.matsim.api.core.v01.population.Person person) {
    return java.util.Arrays.asList(person.getId().toString().split("_")).contains("slum");
}