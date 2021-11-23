public void eclosion() {
    for (int i = 0; i < (this.oeufAEclore.size()); i++) {
        oeufAEclore.get(i).eclosion();
    }
    informerParPheromone(fourmis.FourmiReine.EnumPheromone.VIVRE);
}