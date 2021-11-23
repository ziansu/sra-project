public void enviromentLogic() {
    for (int i = 1; i < (PlayerList.size()); i++) {
        CentralizedDataCenter.Entities.Player player = PlayerList.get(i);
        player.decreaseOrganHp(2);
    }
}