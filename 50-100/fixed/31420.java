public <T extends com.yuliiakulyk.runners.homework.lesson18.universityCard.University> java.util.ArrayList<T> find(java.lang.String searchQuery, java.util.ArrayList<T> array) {
    java.util.ArrayList<T> searchResult = new java.util.ArrayList<>();
    for (T person : array) {
        if (person.toString().toLowerCase().contains(searchQuery.toLowerCase().trim())) {
            searchResult.add(person);
        }
    }
    return searchResult;
}