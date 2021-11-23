private void initializeData() {
    java.util.ArrayList<java.lang.String> listName = new java.util.ArrayList<>();
    listName.add("Singer");
    listName.add("Composer");
    listName.add("Director");
    listName.add("Actor");
    adapter = new com.kangladevelopers.filmfinder.Adapter.SimpleAdapter(getApplicationContext(), listName);
    lvListAll.setAdapter(adapter);
    lvListAll.setOnItemClickListener(this);
}