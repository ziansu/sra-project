public void set_to(name.cantanima.idealnim.Ideal F) {
    playable = new name.cantanima.idealnim.Ideal(F);
    played = new name.cantanima.idealnim.Ideal();
    hinting = false;
    if ((value_text) != null)
        value_text.setText(getContext().getString(R.string.unknown_game_value));
    
    evaluator = new name.cantanima.idealnim.Game_Evaluation_Hashmap(getContext(), playable, null, game_level);
}