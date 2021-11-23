public boolean checkGoal(Pair t) {
    if (goals.contains(t)) {
        goals.remove(t);
        return true;
    }
    return false;
}