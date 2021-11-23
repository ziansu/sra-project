private void proposeNewGame() {
    workers.forEach((Server.Worker w) -> w.proposeNewGame());
}