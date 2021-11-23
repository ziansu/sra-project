public void changeListVal() {
    java.lang.String s = ((java.lang.String) (unitList.getSelectedValue()));
    java.lang.String stats = getStats(s);
    textArea.setText(stats);
}