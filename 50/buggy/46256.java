public void onScrolledToBottom() {
    java.lang.System.out.println("onScrolledToBottom");
    if ((countValue) > (com.byteshaft.auction.SelectedCategoryList.idsArray.size())) {
        showMoreLinearLayout.setVisibility(View.VISIBLE);
    }
}