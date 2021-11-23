public void filter(@android.support.annotation.Nullable
java.lang.String query) {
    if (query != null) {
        if (!(query.equals(searchQuery))) {
            adaper.filter(query);
            if ((adaper.getItemCount()) == 0) {
                showStatusImage(R.drawable.ic_logo_no_results);
            }else {
                hideStatusImage();
            }
            searchQuery = query;
        }
    }
}