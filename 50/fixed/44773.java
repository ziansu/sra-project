public Person getPerson(int pid) {
    if (pid == 0) {
        return PersonsArraylist.get(pid);
    }
    return PersonsArraylist.get((pid - 1));
}