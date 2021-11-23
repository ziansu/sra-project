private static net.sf.json.JSONObject exchangeDates(net.sf.json.JSONObject ex, net.sf.json.JSONObject inter, java.text.DateFormat format) {
    java.lang.String dob = "dob";
    java.lang.String dod = "dod";
    if (ex.containsKey(dob)) {
        inter.put("date_of_birth", format.format(org.phenotips.studies.family.internal.JsonAdapterImpl.pedigreeDateToDate(ex.getJSONObject(dob))));
    }
    if (ex.containsKey(dod)) {
        inter.put("date_of_death", format.format(org.phenotips.studies.family.internal.JsonAdapterImpl.pedigreeDateToDate(ex.getJSONObject(dod))));
    }
    return inter;
}