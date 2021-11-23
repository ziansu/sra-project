public void printList(java.util.List list) {
    for (int i = 0; i < (list.size()); i++) {
        android.util.Log.d("Database", ((("Contents " + i) + ":") + (((Data.Course) (list.get(i))).getCourseName())));
    }
}