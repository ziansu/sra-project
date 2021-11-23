protected boolean isBest(model.Individual ind) {
    if (((best) == null) || ((best.fitness) < (ind.fitness))) {
        best = ind;
        return true;
    }
    return false;
}