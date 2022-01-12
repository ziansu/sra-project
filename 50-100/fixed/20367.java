private void refreshTable() {
    sernet.verinice.service.ldap.PersonInfo[] personArray = personSet.toArray(new sernet.verinice.service.ldap.PersonInfo[personSet.size()]);
    java.util.Arrays.sort(personArray, new java.util.Comparator<sernet.verinice.service.ldap.PersonInfo>() {
        sernet.gs.service.NumericStringComparator comparator = new sernet.gs.service.NumericStringComparator();

        @java.lang.Override
        public int compare(sernet.verinice.service.ldap.PersonInfo o1, sernet.verinice.service.ldap.PersonInfo o2) {
            return comparator.compare(o1.getLoginName(), o2.getLoginName());
        }
    });
    viewer.setInput(personArray);
}