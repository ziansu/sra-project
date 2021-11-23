public void downloadSelected(android.view.View v) {
    sk.matus.ksp.guitarist_swiss_knife.SongDatabaseHelper db = new sk.matus.ksp.guitarist_swiss_knife.SongDatabaseHelper(this);
    java.util.ArrayList<sk.matus.ksp.guitarist_swiss_knife.ScrapeUGActivity.ResultEntryView> marked = gatherMarked();
    saveExtracted = true;
    extractSongs(marked);
}