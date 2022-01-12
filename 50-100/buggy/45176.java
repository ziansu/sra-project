public org.mappingviolence.poi.date.Date.Builder setMonth(java.lang.String month) {
    if (((!(org.mappingviolence.poi.date.Date.Builder.monthsWith30.contains(month))) && (!(org.mappingviolence.poi.date.Date.Builder.monthsWith31.contains(month)))) && ("February".equals(month))) {
        throw new java.lang.IllegalArgumentException((month + " is not a valid month"));
    }
    date.month = month;
    return this;
}