@java.lang.Override
public void convertInput() {
    try {
        java.time.LocalDate date = dateField.getConvertedInput();
        java.time.LocalTime time = timeField.getConvertedInput();
        if ((date == null) || (time == null)) {
            org.apache.wicket.extensions.markup.html.form.datetime.AbstractDateTimeField.setConvertedInput(null);
        }else {
            org.apache.wicket.extensions.markup.html.form.datetime.AbstractDateTimeField.setConvertedInput(performConvert(date, time));
        }
    } catch (java.lang.RuntimeException e) {
        this.error(e.getMessage());
        org.apache.wicket.extensions.markup.html.form.datetime.AbstractDateTimeField.invalid();
    }
}