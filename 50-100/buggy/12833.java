public void syncToDoList() {
    android.content.SharedPreferences toDoSharedPref = getActivity().getSharedPreferences("toDo", Context.MODE_PRIVATE);
    java.lang.String[] splittedList;
    java.lang.String savedList = toDoSharedPref.getString("toDoList", null);
    if (savedList != null) {
        splittedList = savedList.split("\\n");
        toDoList.addAll(java.util.Arrays.asList(splittedList));
    }
    mAdapter.notifyDataSetChanged();
}