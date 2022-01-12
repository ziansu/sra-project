protected void publishResults(java.lang.CharSequence charSequence, thestral.agc.news.FilterResults filterResults) {
    java.util.List<thestral.agc.news.NewsModel> results = ((java.util.List<thestral.agc.news.NewsModel>) (filterResults.values));
    this.filteredList.clear();
    this.filteredList.addAll(results);
    if ((filterResults.count) > 0) {
        this.listAdapter.notifyDataSetChanged();
    }else {
        this.listAdapter.notifyDataSetInvalidated();
    }
}