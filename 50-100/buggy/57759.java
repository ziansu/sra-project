public java.util.List<net.hydrogen2oxygen.domain.Territory> generateRandomTerritories() throws java.lang.Exception {
    java.util.List<net.hydrogen2oxygen.domain.Territory> territories = new java.util.ArrayList<net.hydrogen2oxygen.domain.Territory>();
    for (int x = 0; x < 3; x++) {
        net.hydrogen2oxygen.domain.Territory t = generateRandomTerritory(((net.hydrogen2oxygen.dao.PrintFactoryTest.random.nextInt(14)) + 1), ((net.hydrogen2oxygen.dao.PrintFactoryTest.random.nextInt(120)) + 5));
        territories.add(t);
    }
    return territories;
}