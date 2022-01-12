private void changeView(java.lang.String oldValue) {
    if (oldValue.equals("night")) {
        vbox.setStyle(java.lang.String.format("-fx-background-color: %1$s;", NIGHT_COLOR));
    }
    if (oldValue.equals("day")) {
        vbox.setStyle(java.lang.String.format("-fx-background-color: %1$s;", DAY_COLOR));
    }
}