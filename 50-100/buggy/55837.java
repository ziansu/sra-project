public java.util.ArrayList<java.lang.String> doInBackground(java.lang.Void... Params) {
    try {
        java.lang.String[] result = r.RStoArray(r.QueryCustom("SHOW TABLES"))[0];
        for (java.lang.String s : result) {
            suggestedArray.add(s);
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return suggestedArray;
}