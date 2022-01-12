public void logic() {
    for (int i = 0; i < (PlayerList.size()); i++) {
        CentralizedDataCenter.Entities.Player player = PlayerList.get((i + 1));
        if ((player.getHealth()) == 0) {
            player.setState(StateType.EXHAUST);
        }
        if ((player.getEnergy()) == 0) {
            player.setState(StateType.DEATH);
            alive -= 1;
        }
    }
}