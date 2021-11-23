private long getTimeStamp(int i) {
    table.value.Value date = new table.value.NullValue();
    if (isFirstEvent(i)) {
        date = inputData.get(i).get(datecol);
    }else {
        date = inputData.get(i).get(datecol2);
    }
    if (date.isDate()) {
        return ((table.value.DateValue) (date)).getValue().getTime().getTime();
    }
    throw new java.lang.Error("Not a date in the column");
}