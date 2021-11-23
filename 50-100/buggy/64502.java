private static java.util.List<Reindeer> getReindeerNames() {
    java.util.List<Reindeer> reindeer = new java.util.ArrayList<Reindeer>();
    java.lang.System.out.println("Enter names for the nine reindeer: ");
    java.lang.String name = "";
    for (int i = 0; i < (Game.NUMBER_OF_REINDEER); i++) {
        java.lang.System.out.print(((i + 1) + ". "));
        name = Game.reader.getInput();
        java.lang.System.out.println(("adding " + name));
        reindeer.add(new Reindeer(name));
    }
    return reindeer;
}