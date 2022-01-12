public void syncToDoList() {
    android.content.SharedPreferences toDoSharedPref = getActivity().getSharedPreferences("toDo", Context.MODE_PRIVATE);
    java.lang.String[] splittedList;
    java.lang.String savedList = toDoSharedPref.getString("toDoList", null);
    if (savedList != null) {
        splittedList = savedList.split("\\n");
        for (java.lang.String x : splittedList) {
            if ((x.trim().length()) > 0) {
                toDoList.add(x.trim());
            }
        }
    }
    mAdapter.notifyDataSetChanged();
}