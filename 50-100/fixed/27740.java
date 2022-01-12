private void newHandCycle() {
    java.lang.System.out.println("\n>> DEALING NEW CARDS\n");
    for (int i = 0; i < (playersIn.size()); i++) {
        playersIn.get(i).amountToCall = 0;
        playersIn.get(i).newHand();
        if (playersIn.get(i).isHuman()) {
            java.lang.System.out.println(playersIn.get(i).hand.toString());
        }
    }
}