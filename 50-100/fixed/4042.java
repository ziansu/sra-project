private void initializeData() {
    android.util.Log.i("initializeData", "called");
    java.lang.String exampleTitle = getResources().getString(R.string.example_title);
    java.lang.String exampleDescription = getResources().getString(R.string.example_description);
    tasks = new java.util.ArrayList<>();
    tasks.add(new com.example.heetel.todo.Task(exampleTitle, exampleDescription));
}