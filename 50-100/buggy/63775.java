@java.lang.Override
public void setAcceptableValues(java.util.Collection<java.util.Date> values) {
    java.util.List<java.util.Date> allowedDates = ((java.util.List<java.util.Date>) (values));
    java.util.Collections.sort(allowedDates);
    setDateRange(allowedDates.get(0), allowedDates.get(((allowedDates.size()) - 1)));
}