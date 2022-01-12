public void showTable(java.lang.String q, java.lang.String type) {
    java.util.ArrayList<java.lang.String> result = db.select(q, type);
    for (int i = 0; i < (result.size()); i++) {
        java.lang.System.out.println(((result.get(i)) + "\n"));
    }
}