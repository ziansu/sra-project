public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.new_game :
            startNewGame();
            break;
        case R.id.action_difficulty :
            android.support.v4.app.DialogFragment newFragment = new edu.tatedobson.hhs.tictactoe.DifficultyDialog();
            newFragment.show(getSupportFragmentManager(), "dialog");
    }
    return true;
}