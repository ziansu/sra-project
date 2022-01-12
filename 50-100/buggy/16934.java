public java.util.ArrayList<kr.ac.kaist.hrhrp.type.Person> getNewPersons(java.lang.String ownerId) {
    java.util.ArrayList<java.lang.String> newPersonIds = new java.util.ArrayList<java.lang.String>();
    newPersonIds = dbTemplate.selectNewPersons(ownerId);
    java.util.ArrayList<kr.ac.kaist.hrhrp.type.Person> newPersons = new java.util.ArrayList<kr.ac.kaist.hrhrp.type.Person>();
    for (java.lang.String newPersonId : newPersonIds) {
        kr.ac.kaist.hrhrp.type.Person newPerson = dbTemplate.selectFacesPerson(newPersonId);
        newPersons.add(newPerson);
    }
    return newPersons;
}