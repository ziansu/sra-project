public java.util.List<java.lang.String> toLista(com.google.firebase.database.DataSnapshot ds) {
    java.util.List<java.lang.String> list = new java.util.LinkedList<java.lang.String>();
    for (com.google.firebase.database.DataSnapshot d : ds.getChildren()) {
        android.util.Log.d("COMIDAS", d.getValue().toString());
        list.add(d.getValue().toString());
    }
    return list;
}