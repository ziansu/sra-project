private void choose() {
    double parentA;
    double parentB;
    for (int i = 0; i < ((numberOfMembers) / 2); i++) {
        parentA = ru.kirpech.RandomUtils.nextDouble();
        parentB = ru.kirpech.RandomUtils.nextDouble();
        ru.kirpech.Chromosome a = members.get(binarySearch(parentA));
        ru.kirpech.Chromosome b = members.get(binarySearch(parentB));
        members.addAll(ru.kirpech.Chromosome.crossing(a, b));
    }
}