public java.lang.String validatePeriodHoursToFetch(int value) {
    java.lang.String ret = new pt.lsts.neptus.util.conf.IntegerMinMaxValidator(1, 300, true, true).validate(value);
    if (value < 1)
        value = periodHoursToFetch = 1;
    
    if (value > 300)
        value = periodHoursToFetch = 300;
    
    return ret;
}