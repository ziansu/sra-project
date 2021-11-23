private java.time.LocalTime getTime() {
    int hours = java.lang.Integer.parseInt(hr_field.getText().substring(2));
    int min = java.lang.Integer.parseInt(min_field.getText().substring(2));
    int seconds = java.lang.Integer.parseInt(sec_field.getText().substring(2));
    return java.time.LocalTime.of(hours, min, seconds);
}