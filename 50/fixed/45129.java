@java.lang.Override
protected void onRestart() {
    super.onRestart();
    puzzleArray.clear();
    puzzleArray.addAll(myDBHandler.getAllPuzzles());
    java.util.Collections.sort(puzzleArray);
    adapter.notifyDataSetChanged();
}