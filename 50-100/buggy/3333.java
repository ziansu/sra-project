private void generateDecks() {
    try {
        for (int i = 0; i < 3; i++) {
            buildAge(i);
        }
        shuffle();
    } catch (java.lang.Exception e) {
        java.lang.System.out.print("Could not build decks properly.");
        e.printStackTrace();
    }
}