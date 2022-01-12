@java.lang.Override
public void onFailure(retrofit2.Call<com.sdsmdg.bookshareapp.BSA.api.models.LocalBooks.BookList> call, java.lang.Throwable t) {
    android.util.Log.d("GA_search", ("searchOnFail " + (t.toString())));
    refreshLayout.setRefreshing(false);
    progressBar.setVisibility(View.GONE);
    innerLayout.getForeground().setAlpha(0);
    l1.setVisibility(View.GONE);
    l2.setVisibility(View.GONE);
}