public void setPrecedenceListId(java.lang.Long id) {
    if (id != null) {
        if ((precedenceList) == null) {
            precedenceList = new com.wci.umls.server.jpa.helpers.PrecedenceListJpa();
        }
        precedenceList.setId(id);
    }
}