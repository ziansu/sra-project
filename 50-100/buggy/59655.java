public void addToList(java.util.ArrayList<java.lang.String> taskInputs) {
    com.izzygomez.workr.ListedItem listViewInput = new com.izzygomez.workr.ListedItem(taskInputs.get(0), taskInputs.get(1), taskInputs.get(2), taskInputs.get(3));
    if (!(listItems.contains(listViewInput))) {
        listItems.add(listViewInput);
        adapter.notifyDataSetChanged();
        lastClickedRowArray = taskInputs;
    }
}