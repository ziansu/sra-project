public void fetchCount(final tk.lefourretoutsonore.lefourre_toutsonore.RecyclerAdapter.EventViewHolder holder, final int position) {
    android.util.Log.i("fetchCount", ("Fetching count for " + (holder.title.getText())));
    tk.lefourretoutsonore.lefourre_toutsonore.PlayListRelated.PlayList pl = new tk.lefourretoutsonore.lefourre_toutsonore.PlayListRelated.PlayList(choiceSource[position], context, null, null);
    if (pl.retrieveFromDisk())
        holder.counter.setText(((pl.getCount()) + " ajouts"));
    
}