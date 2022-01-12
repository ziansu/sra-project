public void filter(@android.support.annotation.Nullable
java.lang.String query) {
    adaper.filter(query);
    if (((adaper.getItemCount()) == 0) && ((count) > 0)) {
        showStatusImage(R.drawable.ic_logo_no_results);
    }else
        if ((count) > 0) {
            hideStatusImage();
        }
    
    searchQuery = query;
}