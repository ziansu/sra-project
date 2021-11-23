public void onJokeFetched(java.lang.String joke) {
    hideSpinner();
    final android.content.Intent libraryIntent = new android.content.Intent(this, com.cloudskol.jokemalib.LibraryActivity.class);
    libraryIntent.putExtra(com.cloudskol.jokema.MainActivity.JOKE, joke);
    startActivity(libraryIntent);
}