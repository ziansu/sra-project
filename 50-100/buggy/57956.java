public void SetPlayerName() {
    scanner.nextLine();
    for (int i = 0; i < 4; i++) {
        int playerNumber = i + 1;
        java.lang.System.out.println((("Please enter a name for player " + playerNumber) + ": "));
        java.lang.String name = scanner.nextLine();
        playerList.get(i).name = name;
        player.dice.RollDice();
        player.SetDiceValue();
    }
}