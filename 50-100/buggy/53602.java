private void init() {
    mKanjiListView = ((android.widget.ListView) (findViewById(R.id.kanjiList)));
    mKanjiListView.setEmptyView(findViewById(R.id.emptyKanjiView));
    mFilterSpinner = ((android.widget.Spinner) (findViewById(R.id.filterCategory)));
    mKDBHelper = new shiba.test.androidkanji.KanjiDBHelper(mCtx);
    fillData();
    mFilterSpinner.setOnItemSelectedListener(mFilterSelected);
}