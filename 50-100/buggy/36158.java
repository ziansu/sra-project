public java.util.ArrayList<Task> getSearched(java.lang.String text) {
    java.util.ArrayList<Task> searchedList = new java.util.ArrayList<Task>();
    for (Task task : myList) {
        if (task.getDescription().contains(text)) {
            searchedList.add(task);
        }
    }
    return searchedList;
}