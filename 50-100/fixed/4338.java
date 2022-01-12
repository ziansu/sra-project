@java.lang.Override
public void onClick(android.view.View view) {
    if (((ean) != null) && (!(ean.getText().equals("")))) {
        android.content.Intent bookIntent = new android.content.Intent(getActivity(), it.jaschke.alexandria.services.BookService.class);
        bookIntent.putExtra(BookService.EAN, ean.getText().toString());
        bookIntent.setAction(BookService.DELETE_BOOK);
        getActivity().startService(bookIntent);
        ean.setText("");
    }
}