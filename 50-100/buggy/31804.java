private void changeView(java.lang.String oldValue, java.lang.String newValue) {
    if ((oldValue.equals("night")) && (newValue.equals(""))) {
        vbox.setStyle(java.lang.String.format("-fx-background-color: %1$s;", NIGHT_COLOR));
    }
    if ((oldValue.equals("day")) && (newValue.equals(""))) {
        vbox.setStyle(java.lang.String.format("-fx-background-color: %1$s;", DAY_COLOR));
    }
}