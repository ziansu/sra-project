@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if ((io.github.sdsstudios.ScoreKeeper.NewGame.spinnerPreset.getSelectedItemPosition()) != 0) {
        loadGame((i + 1));
    }else {
        reset();
    }
}