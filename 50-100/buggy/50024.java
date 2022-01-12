@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.gmail.mateuszmonas.macroapp.faktury.FakturyActivity.SEARCH_REQUEST)) {
        if (resultCode == (RESULT_OK)) {
            com.gmail.mateuszmonas.macroapp.fakturasearch.FakturaSearchParameters searchParameters = data.getParcelableExtra(com.gmail.mateuszmonas.macroapp.faktury.FakturyActivity.EXTRA_SEARCH_PARAMETERS);
            presenter.setSearchParameters(searchParameters);
            presenter.loadFaktury(0, true);
            searched = true;
        }
    }
}