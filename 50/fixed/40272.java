private com.airamerica.person.Person findPerson(java.lang.String personCode) {
    for (com.airamerica.person.Person p : persons) {
        if (p.getCode().equals(personCode)) {
            return p;
        }
    }
    return null;
}