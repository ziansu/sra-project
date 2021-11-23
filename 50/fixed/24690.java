@java.lang.Override
public void onRefresh() {
    refresh = true;
    new com.byteshaft.auction.SelectedCategoryList.GetSpecificDataTask().execute(categorySpecificUrl);
}