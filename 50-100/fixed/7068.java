private void init() {
    for (lightpos.light[] parent : parents) {
        for (int i = 0; i < (nNumber); i++) {
            parent[i] = new lightpos.light(generatorRandom.nextInt(((roomWidth) + 1)), generatorRandom.nextInt(((roomLength) + 1)), generatorRandom.nextInt(5), true);
        }
    }
}