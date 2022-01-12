private void winnerIs(model.Squad crew1, model.Squad crew2) {
    java.lang.String winner;
    java.lang.String looser;
    if (crew1.hasAliveWarriors()) {
        winner = crew1.getName();
        looser = crew2.getName();
    }else {
        winner = crew2.getName();
        looser = crew1.getName();
    }
    msg.append("Отряд ").append(winner).append(" победил, уничтожив отряд ").append(looser).append("\n");
    notifyObserver();
}