private void populateUi() {
    final android.view.View rootView = getWindow().getDecorView();
    rootView.setKeepScreenOn(settings.keepScreenOn());
    rootView.setBackgroundColor(settings.getBackgroundColor());
    versePager.getAdapter().notifyDataSetChanged();
    currentTranslation = bibleReadingPresenter.loadCurrentTranslation();
    currentBook = bibleReadingPresenter.loadCurrentBook();
    currentChapter = bibleReadingPresenter.loadCurrentChapter();
}