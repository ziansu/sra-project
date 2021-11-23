public Chromosome tournament() {
    Chromosome parent;
    parent = chromePop.get(random.nextInt(chromePop.size()));
    for (int j = 0; j < (tournamentSize); j++) {
        int point = random.nextInt(chromePop.size());
        if ((chromePop.get(point).compareTo(parent)) > 0) {
            parent = chromePop.get(point);
        }
    }
    return parent;
}