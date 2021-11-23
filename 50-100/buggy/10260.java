@java.lang.Override
protected T convertValue(java.lang.String[] value) throws org.apache.wicket.util.convert.ConversionException {
    this.convertValue = true;
    if ((value != null) && ((value.length) > 0)) {
        this.convertedInput = this.provider.toChoice(value[0]);
        return this.convertedInput;
    }else {
        return null;
    }
}