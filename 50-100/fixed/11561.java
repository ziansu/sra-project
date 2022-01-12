@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((data != null) && (!(data.getStringExtra(it.jaschke.alexandria.AddBook.ISBN_RESULT).equals("-1")))) {
        ean.setText(data.getStringExtra(it.jaschke.alexandria.AddBook.ISBN_RESULT));
    }
}