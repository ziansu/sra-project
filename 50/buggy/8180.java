private void clearSearchAfterNewArtistSelection() {
    tweens.doCheckOnToolBar();
    imm.hideSoftInputFromWindow(edtextinput.getWindowToken(), 0);
    edtextinput.removeTextChangedListener(fo);
    searchlist.cleanAdpater();
    tweens.doSearchTweenOut();
}