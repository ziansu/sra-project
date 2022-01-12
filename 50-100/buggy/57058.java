public void setFooter(android.view.View footer) {
    boolean new_footer = ((footerView) == null) ? true : false;
    footerView = footer;
    if (new_footer)
        notifyItemInserted(allMovies.size());
    else
        if (footer == null)
            notifyItemRemoved(allMovies.size());
        else
            notifyItemChanged(allMovies.size());
        
    
}