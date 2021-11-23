void init() {
    if (initialized) {
        return ;
    }
    int numagents = helpers.size();
    chosenHelper = helpers.get(((TestAgent.counter) % numagents));
    (TestAgent.counter)++;
    initialized = true;
}