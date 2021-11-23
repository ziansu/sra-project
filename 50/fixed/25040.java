public void onClick(android.view.View v) {
    if ((player2_textureState) > 1) {
        (Gameplay.player2_pers)--;
        (player2_textureState)--;
        com.example.myapplication.Options.setPlayersPicturesForVar(player2_textureState, player2_leftArrow, player2_texture, player2_rightArrow);
    }
}