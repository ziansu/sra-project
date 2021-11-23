public void discardCycle() {
    for (int i = 0; i < (playersIn.size()); i++) {
        playersIn.get(i).discard();
        if (playersIn.get(i).isHuman()) {
            java.lang.System.out.println(playersIn.get(i).hand.toString());
        }
    }
}