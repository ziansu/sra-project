private void appendLuceneCoreFacilitiesIManage(java.lang.StringBuffer searchText) {
    boolean firstTime = true;
    for (hci.gnomex.model.CoreFacility cf : ((java.util.Set<hci.gnomex.model.CoreFacility>) (this.getCoreFacilitiesIManage()))) {
        if (!firstTime) {
            searchText.append(" ");
            firstTime = false;
        }
        searchText.append(cf.getIdCoreFacility());
    }
}