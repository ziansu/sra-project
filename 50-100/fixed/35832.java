@butterknife.OnClick(value = R.id.button_search)
public void onClick(android.view.View view) {
    java.lang.String searchedText = edtSearch.getText().toString();
    if (android.text.TextUtils.isEmpty(searchedText)) {
        edtSearch.setError(getText(R.string.search_text_missing));
        return ;
    }
    android.content.Intent iSearch = new android.content.Intent(this, com.example.vibs.bookfinder.BookActivity.class);
    iSearch.putExtra("searchKey", searchedText);
    startActivity(iSearch);
}