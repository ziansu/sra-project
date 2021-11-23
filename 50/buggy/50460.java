public java.lang.String addPerson(de.iceburner.apps.serapeum.lib.Person person) {
    java.lang.String key = createKey(person.getName().substring(0, 4));
    mPersons.put(key, person);
    return key;
}