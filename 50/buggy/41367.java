@java.lang.Override
protected void setFilter() {
    setFilter(bn.blaszczyk.fussballstats.filters.GameFilterFactory.createDayOfWeekFilter(boxDayOfWeek.getSelectedIndex()));
}