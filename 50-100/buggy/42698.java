protected void correctAfterMonthAdd() {
    if ((getInternalValueLimit()) < (getValueInternal())) {
        int delta = (getValueInternal()) - (getInternalValueLimit());
        setValueInternal(getInternalValueLimit());
        addDayValue(delta);
    }
}