public static java.lang.String getDateString(org.eclipse.swt.widgets.DateTime date) {
    return ((((date.getYear()) + "-") + ((date.getMonth()) + 1)) + "-") + (date.getDay());
}