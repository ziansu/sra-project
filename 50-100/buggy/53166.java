@java.lang.Override
public void convertInput() {
    try {
        java.time.LocalDate localDate = dateField.getConvertedInput();
        if (localDate == null) {
            return ;
        }
        java.time.LocalTime localTime = timeField.getConvertedInput();
        org.apache.wicket.extensions.markup.html.form.datetime.AbstractDateTimeField.setConvertedInput(performConvert(localDate, localTime));
    } catch (java.lang.RuntimeException e) {
        this.error(e.getMessage());
        org.apache.wicket.extensions.markup.html.form.datetime.AbstractDateTimeField.invalid();
    }
}