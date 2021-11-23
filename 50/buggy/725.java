public static java.util.List<java.lang.Integer> getContinentCountries(int continent) {
    if (continent > (com.mld46.oponn.MapStats.continentCountries.size())) {
        java.lang.System.out.println("Hmm");
    }
    return new java.util.ArrayList<java.lang.Integer>(com.mld46.oponn.MapStats.continentCountries.get(continent));
}