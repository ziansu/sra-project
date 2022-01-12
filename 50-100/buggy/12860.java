public void onClick(android.view.View v) {
    android.util.SparseBooleanArray checked = daysList.getCheckedItemPositions();
    java.util.ArrayList<java.lang.Integer> daysSelected = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < (checked.size()); i++) {
        daysSelected.add(i);
    }
    this.headBackToMainScreen(daysSelected);
}