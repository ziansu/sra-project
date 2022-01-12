public static void main(java.lang.String[] args) {
    World map = new World("/Users/Rooster/Documents/world.map");
    map.setVisible(true);
    java.lang.System.out.println(map.territories.get(1).getNeighbors().isEmpty());
    java.lang.System.out.println(map.continents.isEmpty());
}