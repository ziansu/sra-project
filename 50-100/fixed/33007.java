public void updateInfo(java.lang.String[] dropDownTitles, javax.swing.JComboBox j) {
    j.removeAllItems();
    java.util.Set<java.lang.String> movieDates = new java.util.HashSet<>();
    java.util.Collections.addAll(movieDates, dropDownTitles);
    java.util.ArrayList<java.lang.String> dateArrayList = new java.util.ArrayList<>(movieDates);
    java.util.Collections.sort(dateArrayList);
    for (java.lang.String k : dateArrayList) {
        j.addItem(k);
    }
    repaint();
}