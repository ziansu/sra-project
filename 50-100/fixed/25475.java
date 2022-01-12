public void dealPlayerCards(main.java.Game.Player player) {
    output.println("DEALING START ");
    for (int i = 0; i < (player.hand.size()); i++) {
        output.println(("CARD " + (player.hand.get(i))));
    }
    output.println("DEALING COMPLETE");
}