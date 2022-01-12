protected void correctAfterMonthSet() {
    if ((getInternalValueLimit()) <= (getValueInternal())) {
        setValueInternal(getInternalValueLimit());
    }
}