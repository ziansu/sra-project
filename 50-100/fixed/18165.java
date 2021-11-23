private java.time.LocalTime getTime() {
    int hours = java.lang.Integer.parseInt(hr_field.getText());
    int min = java.lang.Integer.parseInt(min_field.getText());
    int seconds = java.lang.Integer.parseInt(sec_field.getText());
    return java.time.LocalTime.of(hours, min, seconds);
}