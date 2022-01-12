@java.lang.Override
protected com.example.petr.myapplication.FilterResults performFiltering(java.lang.CharSequence charSequence) {
    com.example.petr.myapplication.FilterResults filterResults = new com.example.petr.myapplication.FilterResults();
    java.util.List<java.lang.String> results = findSuggestions(charSequence.toString());
    if ((charSequence.length()) != 0) {
        filterResults.values = results;
        filterResults.count = results.size();
    }
    return filterResults;
}