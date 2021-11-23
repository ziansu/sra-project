private static void getOption() {
    try {
        MonoCreature mc1 = new MonoCreature("Q", "Q");
        MonoCreature mc2 = new MonoCreature("q", "q");
        MonoHybrid m = new MonoHybrid();
        m.seedParents(mc1, mc2);
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.out.println("Wrong genotype entered!");
    } finally {
        java.lang.System.out.println("\n\nEnd of program");
    }
}