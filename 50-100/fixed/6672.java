public void restore_to(java.util.ArrayList<java.lang.Integer> old_playable, java.util.ArrayList<java.lang.Integer> old_played, int level) {
    playable = new name.cantanima.idealnim.Ideal(old_playable);
    played = new name.cantanima.idealnim.Ideal(old_played);
    game_level = level;
    evaluator = new name.cantanima.idealnim.Game_Evaluation_Hashmap(getContext(), playable, played, game_level);
    evaluator.game_value();
    game_control = new name.cantanima.idealnim.Game_Control();
    game_control.new_game(this, view_xmax, view_ymax, game_level, false);
    invalidate();
}