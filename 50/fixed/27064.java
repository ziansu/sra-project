public void selectBotPlayers() {
    for (int i = 1; i < (numPlayers); ++i) {
        botPlayerIds[i] = i - 1;
        java.lang.System.out.println(botPlayerIds[i]);
    }
}