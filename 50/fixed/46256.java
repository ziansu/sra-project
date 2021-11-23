public void onScrolledToBottom() {
    if ((countValue) > (com.byteshaft.auction.SelectedCategoryList.idsArray.size())) {
        showMoreLinearLayout.setVisibility(View.VISIBLE);
    }
}