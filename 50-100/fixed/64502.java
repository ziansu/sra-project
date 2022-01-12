private static java.util.List<Reindeer> getReindeerNames() {
    java.util.List<Reindeer> reindeer = new java.util.ArrayList<Reindeer>();
    java.lang.System.out.println("Enter names for the nine reindeer: ");
    for (int i = 0; i < (Game.NUMBER_OF_REINDEER); i++) {
        java.lang.System.out.print(((i + 1) + ". "));
        reindeer.add(new Reindeer(Game.reader.getInput()));
    }
    return reindeer;
}