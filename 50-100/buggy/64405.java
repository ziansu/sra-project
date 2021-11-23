public void printList(java.util.List list) {
    for (int i = 0; i < (list.size()); i++) {
        Data.Course one = ((Data.Course) (list.get(i)));
        android.util.Log.d("Database", ((("Contents " + i) + ":") + (one.getCourseName())));
    }
}