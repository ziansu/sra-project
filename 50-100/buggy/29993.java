private void initView() {
    app.com.warattil.font.FontHelper.setFontFace(FontHelper.FontType.FONT_MEDIUM, editTextSearch);
    recyclerViewSurah.setHasFixedSize(true);
    android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    recyclerViewSurah.setLayoutManager(mLayoutManager);
    mAdapter = new app.com.warattil.adapter.SurahAdapter(this, mLanguageType, mReciterType, surahs);
    recyclerViewSurah.setAdapter(mAdapter);
    mAdapter.notifyDataSetChanged();
    searchFilter();
}