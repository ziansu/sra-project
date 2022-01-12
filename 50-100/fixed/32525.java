public java.util.ArrayList<java.lang.String[]> limit(java.lang.String DBname, java.lang.String Tname, int num) {
    java.util.ArrayList<dbms.Record> records = get_records(DBname, Tname);
    java.util.ArrayList<java.lang.String[]> results = new java.util.ArrayList<java.lang.String[]>();
    int i = 0;
    while ((i < num) && (i < (records.size()))) {
        results.add(records.get(i).get());
        i++;
    } 
    return results;
}