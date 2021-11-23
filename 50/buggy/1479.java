public void death() {
    stop();
    setState(MovableState.DEATH);
    this.health = 0;
    java.lang.System.out.println(("Death! " + (getName())));
}