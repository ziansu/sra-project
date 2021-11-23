public void showTable(java.lang.String q, java.lang.String type) {
    java.lang.System.out.println("In showTable");
    java.util.ArrayList<java.lang.String> result = db.select(q, type);
    java.lang.System.out.println(("Result: " + result));
    for (int i = 0; i < (result.size()); i++) {
        java.lang.System.out.println(((result.get(i)) + "\n"));
    }
}