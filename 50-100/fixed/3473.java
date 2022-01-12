private boolean guess() {
    if ((workingSet.size()) == 0) {
        return false;
    }
    Literal pop = workingSet.remove(0);
    model.add(new Literal(pop.get(), true));
    (modelSize)++;
    (assignCount[((pop.get()) - 1)])++;
    lastGuess.add(pop);
    return true;
}