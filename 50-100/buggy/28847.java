public static void main(java.lang.String[] args) {
    model.player.Player player1 = new model.player.Player(1, "Blue");
    model.player.Player player2 = new model.player.Player(2, "Red");
    controller.play.Game game = new controller.play.Game(player1, player2, "KingTopLeftRight");
    view.Viewer viewer = new view.Viewer(game);
}