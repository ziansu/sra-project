public void onClick(android.view.View v) {
    editor.putInt("game_progress", 0);
    editor.putInt("game_progress_max", 10);
    editor.putString("game_mode", "capitals");
    editor.putString("game_title", "Learn the Capitals");
    editor.apply();
    startActivity(intent);
}