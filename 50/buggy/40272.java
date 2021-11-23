private com.airamerica.person.Person findPerson(java.lang.String personCode) {
    for (com.airamerica.person.Person p : persons) {
        if ((p.getCode()) == personCode) {
            return p;
        }
    }
    return null;
}