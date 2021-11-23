private void updateNextButton() {
    boolean enabled = this.newGameEvent.allPlayersGotCharacters();
    setMenuItem(enabled, 2, 0);
    java.lang.System.out.println(("Next button is enabled: " + enabled));
}