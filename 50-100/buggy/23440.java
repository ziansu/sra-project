public boolean addPersonToApartment(Model.Person person) {
    if (person == null) {
        return false;
    }
    if (members.contains(person)) {
        return false;
    }
    com.parse.ParseRelation<Model.Person> relation = getUserRelation();
    relation.add(person);
    incrementNumberOfResidents();
    saveInBackground();
    return true;
}