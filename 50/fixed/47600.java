public void ratio(int count_mutants, int count_humans) {
    if (count_humans > 0) {
        ratio = ((double) (count_mutants)) / ((double) (count_humans));
    }
}