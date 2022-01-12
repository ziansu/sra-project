public void addPublication(java.lang.String country, java.lang.String publication) {
    if ((issues.get(country)) == null)
        this.addCountry(country);
    
    if ((issues.get(country).get(publication)) == null) {
        issues.get(country).put(publication, new java.util.ArrayList<net.ducksmanager.whattheduck.Issue>());
    }
}