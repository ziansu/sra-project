private void updateNextButton() {
    boolean enabled = this.newGameEvent.allPlayersGotCharacters();
    setMenuItem(enabled, 2, 0);
}