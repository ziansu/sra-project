public void logic() {
    for (int i = 1; i <= (PlayerList.size()); i++) {
        CentralizedDataCenter.Entities.Player player = PlayerList.get(i);
        if ((player.getHealth()) == 0) {
            player.setState(StateType.EXHAUST);
        }
        if ((player.getEnergy()) == 0) {
            player.setState(StateType.DEATH);
            alive -= 1;
        }
    }
}