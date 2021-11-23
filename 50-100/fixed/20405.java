@java.lang.Override
protected bubbleheads.buy_cook.FilterResults performFiltering(final java.lang.CharSequence constraint) {
    bubbleheads.buy_cook.FilterResults results = new bubbleheads.buy_cook.FilterResults();
    if (!(constraint.toString().isEmpty())) {
        final java.util.List<bubbleheads.buy_cook.Recipe> search = searchRecipeName(constraint, backupRecipes);
        results.count = search.size();
        results.values = search;
    }else {
        results.count = backupRecipes.size();
        results.values = backupRecipes;
    }
    return results;
}