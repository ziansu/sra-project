public void dealPlayerCards(main.java.Game.Player player, int player_num) {
    output.println("DEALING START ");
    for (int i = 0; i < 4; i++) {
        if ((player.player_num) != player_num) {
            player = player.next;
        }
    }
    for (int i = 0; i < (player.hand.size()); i++) {
        output.println(("CARD " + (player.hand.get(i))));
    }
    output.println("DEALING COMPLETE");
}