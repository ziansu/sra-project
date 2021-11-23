private java.util.List<com.inverita.testapp.Person> initializeData() {
    persons = new java.util.ArrayList<>();
    for (int i = 0; i < 30; i++) {
        if ((i % 2) == 0) {
            persons.add(new com.inverita.testapp.Person("Bonnie Parker", "25 years old", R.mipmap.female));
        }else {
            persons.add(new com.inverita.testapp.Person("Clyde Barrow", "30 years old", R.mipmap.male));
        }
    }
    return persons;
}