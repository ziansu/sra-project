private void callBookIntent(java.lang.String ean) {
    android.util.Log.v(it.jaschke.alexandria.AddBook.TAG, "start book intent");
    android.content.Intent bookIntent = new android.content.Intent(getActivity(), it.jaschke.alexandria.services.BookService.class);
    bookIntent.putExtra(Constants.EAN, ean);
    bookIntent.setAction(Constants.FETCH_BOOK);
    getActivity().startService(bookIntent);
    this.restartLoader();
}