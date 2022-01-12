public java.util.List<java.lang.String> completeUserName(java.lang.String incompleteUserName) {
    try {
        java.util.List<se.vgregion.ldap.person.Person> people = ldapPersonService.getPeople((incompleteUserName + "*"), 10);
        java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
        for (se.vgregion.ldap.person.Person person : people) {
            result.add(person.getUserName());
        }
        return result;
    } catch (java.lang.Exception e) {
        return java.util.Arrays.asList("a", "b", "c");
    }
}