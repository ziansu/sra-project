public java.util.Collection<io.vntr.jabeja.JabejaUser> getRandomSamplingOfUsers(int n) {
    return getUsers(getKDistinctValuesFromList(n, uMap.keySet()));
}