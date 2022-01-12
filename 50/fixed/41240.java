public static void main(java.lang.String[] args) {
    battleberger.model.Game g = new battleberger.model.Game(new battleberger.model.player.Human(), new battleberger.model.player.Computer(), new battleberger.view.Window());
    g.play();
}