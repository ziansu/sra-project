private void game_over(edu.oregonstate.cs361.battleship.BattleshipModel model) {
    if ((model.get_player_hits().size()) == (edu.oregonstate.cs361.battleship.Game.max_hits)) {
        game_complete(model, true);
    }
    if ((model.get_computer_hits().size()) == (edu.oregonstate.cs361.battleship.Game.max_hits)) {
        game_complete(model, false);
    }
}