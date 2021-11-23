private void callBookIntent(java.lang.String ean) {
    android.content.Intent bookIntent = new android.content.Intent(getActivity(), it.jaschke.alexandria.services.BookService.class);
    bookIntent.putExtra(Constants.EAN, ean);
    bookIntent.setAction(Constants.FETCH_BOOK);
    getActivity().startService(bookIntent);
    this.restartLoader();
}