public com.googlecode.e2u.AboutBookView getAboutBookView() {
    if ((aboutBookView) == null) {
        aboutBookView = new com.googlecode.e2u.AboutBookView(bookReader.getResult().getBook(), menu);
    }
    return aboutBookView;
}