public java.util.ArrayList<java.lang.String[]> limit(java.lang.String DBname, java.lang.String Tname, int num) {
    java.lang.System.out.println("limit DBMS");
    java.util.ArrayList<dbms.Record> records = get_records(DBname, Tname);
    java.util.ArrayList<java.lang.String[]> results = new java.util.ArrayList<java.lang.String[]>();
    for (int i = 0; i < num; i++) {
        results.add(records.get(i).get());
    }
    return results;
}