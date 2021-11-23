private java.util.Date parseDate(java.lang.String value) {
    if ((value == null) || (value.equals(au.com.vaadinutils.layout.TimePicker.EMPTY))) {
        return null;
    }
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(au.com.vaadinutils.layout.TimePicker.TIME_FORMAT);
    try {
        return sdf.parse(value);
    } catch (java.text.ParseException e) {
        sdf = new java.text.SimpleDateFormat(au.com.vaadinutils.layout.TimePicker.TIME_FORMAT2);
        try {
            return sdf.parse(value);
        } catch (java.text.ParseException e2) {
            throw new com.vaadin.data.Validator.InvalidValueException(("Time format is " + (au.com.vaadinutils.layout.TimePicker.TIME_FORMAT)));
        }
    }
}