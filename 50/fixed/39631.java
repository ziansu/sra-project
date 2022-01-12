public void startGame() {
    ar.fiuba.tdd.tp.interaction.UserInteracter interacter = new ar.fiuba.tdd.tp.interaction.UserInteracter();
    this.lastUserEvent = interacter.handleUserEvent();
    java.lang.System.out.println(this.lastUserEvent);
}