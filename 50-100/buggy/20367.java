private void refreshTable() {
    java.lang.Object[] personArray = personSet.toArray();
    java.util.Arrays.sort(personArray, new java.util.Comparator() {
        sernet.gs.service.NumericStringComparator comparator = new sernet.gs.service.NumericStringComparator();

        @java.lang.Override
        public int compare(java.lang.Object o1, java.lang.Object o2) {
            return comparator.compare(((sernet.verinice.service.ldap.PersonInfo) (o1)).getLoginName(), ((sernet.verinice.service.ldap.PersonInfo) (o2)).getLoginName());
        }
    });
    viewer.setInput(personArray);
}