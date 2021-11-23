void init() {
    if (initialized) {
        return ;
    }
    int numagents = helpers.size();
    java.lang.System.err.println(("numagents = " + numagents));
    chosenHelper = helpers.get(((TestAgent.counter) % numagents));
    java.lang.System.err.println(("counter = " + (TestAgent.counter)));
    java.lang.System.err.println(("class = " + (chosenHelper.getClass().toString())));
    (TestAgent.counter)++;
    initialized = true;
}