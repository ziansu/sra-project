private void spin() {
    for (int i = org.lizardirc.beancounter.RouletteHandler.random.nextInt(loaded.size()); i > 0; i--) {
        loaded.add(loaded.remove(0));
    }
}