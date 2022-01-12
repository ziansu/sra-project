public java.util.List<java.lang.String> getJobNames() {
    java.util.List<java.lang.String> out = new java.util.ArrayList<>();
    java.lang.String sql = "SELECT `exname` FROM `exercise`";
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> results = db.retrieveQueryString(sql);
    for (java.util.Map<java.lang.String, java.lang.String> row : results) {
        java.lang.String exname = row.get("exname");
        out.add(exname);
    }
    return out;
}