public void ReadForm(org.molgenis.framework.server.MolgenisRequest request) {
    try {
        java.lang.String action = request.getString("__action");
        if (action.equals("generateYearlyReport")) {
            this.year = request.getInt("year");
            this.form = request.getString("form");
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}