public void run() {
    java.util.Collections.sort(inventoryList, new jonghoonlim.two_oh.dataStructures.CustomComparator());
    adapter = new jonghoonlim.two_oh.dataStructures.CustomAdapter(this, R.layout.check_in_row, inventoryList, inventoryList);
    lv.setAdapter(adapter);
}