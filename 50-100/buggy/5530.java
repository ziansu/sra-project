private void refreshView() {
    ignoreChange = true;
    jnCalendar.set(_date);
    monthsCB.setSelectedIndex(new java.lang.Integer(_date.getMonth()));
    yearSpin.setValue(new java.lang.Integer(_date.getYear()));
    ignoreChange = false;
}