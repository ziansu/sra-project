private java.util.List<com.inverita.testapp.Person> initializeData() {
    persons = new java.util.ArrayList<>();
    for (int i = 1; i <= 30; i++) {
        if ((i % 2) == 0) {
            persons.add(new com.inverita.testapp.Person(("Bonnie Parker" + i), "25 years old", R.mipmap.female));
        }else {
            persons.add(new com.inverita.testapp.Person(("Clyde Barrow" + i), "30 years old", R.mipmap.male));
        }
    }
    return persons;
}