private void generateDecks() {
    try {
        for (int i = 0; i < 3; i++) {
            buildAge(i);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.print("Could not build decks properly.");
        e.printStackTrace();
        java.lang.System.exit(1);
    }
}