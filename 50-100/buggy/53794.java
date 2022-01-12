private boolean isLinked(Person one, Person two, java.util.HashSet<Person> visited) {
    if (one == two) {
        return true;
    }
    if (visited.contains(one)) {
        return false;
    }
    visited.add(one);
    for (Person other : two.getKnownPersons()) {
        if (isLinked(other, two, visited)) {
            return true;
        }
    }
    return false;
}