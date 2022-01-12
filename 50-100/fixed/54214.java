public static void main(java.lang.String[] args) {
    World map = new World();
    map.setVisible(true);
    java.lang.System.out.println(map.territories.get(1).getNeighbors().isEmpty());
    java.lang.System.out.println(map.continents.isEmpty());
}