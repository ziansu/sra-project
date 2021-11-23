public int checkLeader() {
    if ((preparatorLead.size()) == ((playerSize()) - 1)) {
        return makeLeader();
    }
    return -1;
}