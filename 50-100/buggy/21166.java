@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.widget.TextView errorTextView = ((android.widget.TextView) (findViewById(R.id.error_text_view)));
    if (result == null) {
        recyclerView.setVisibility(View.INVISIBLE);
        errorTextView.setVisibility(View.VISIBLE);
    }else {
        recyclerView.setVisibility(View.VISIBLE);
        errorTextView.setVisibility(View.INVISIBLE);
    }
    progressBar.setVisibility(View.INVISIBLE);
    java.util.ArrayList<elrast.com.book.Book> books = elrast.com.book.ApiUtil.getBooksFromJson(result);
    elrast.com.book.BookAdapter bookAdapter = new elrast.com.book.BookAdapter(books);
    recyclerView.setAdapter(bookAdapter);
}