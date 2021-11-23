public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.json.JSONObject patientSearch = new org.json.JSONObject();
    patientSearch.put("familyName", new java.lang.String("ppp"));
    patientSearch.put("givenName", new java.lang.String("eee"));
    fhirconverter.ConverterOpenempi test = new fhirconverter.ConverterOpenempi();
    test.patientSearch(patientSearch);
    java.lang.System.out.println("TESTING FOR READ");
    test.patientRead("1");
    java.lang.System.out.println("TESTING FOR DELETE");
    java.lang.System.out.println(test.patientDelete("2"));
}