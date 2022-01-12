public void setJmenaNechtenychlel(java.util.Set<java.lang.String> jmenaNechtenychAlel) {
    if (jmenaNechtenychAlel.equals(filter.getJmenaNechtenychAlel()))
        return ;
    
    filter.setJmenaNechtenychAlel(jmenaNechtenychAlel);
    currPrefe().node(FPref.KESOID_FILTR_node).putStringSet(FPref.KESOID_FILTER_ALELY_value, jmenaNechtenychAlel);
    fajruj();
}