@java.lang.Override
public boolean onItemLongClicked(int position, int gameID) {
    if ((actionMode) == null) {
        actionMode = ((android.support.v7.app.AppCompatActivity) (this)).startSupportActionMode(new io.github.sdsstudios.ScoreKeeper.History.ActionBarCallback());
    }
    if ((actionMode) != null) {
        actionMode.setTitle((1 + " items selected"));
    }
    multiSelectEnabled();
    toggleSelection(position, gameID);
    return true;
}