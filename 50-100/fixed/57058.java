public void setFooter(android.view.View footer) {
    boolean new_footer = ((footerView) == null) ? true : false;
    footerView = footer;
    if (new_footer && (footer != null))
        notifyItemInserted(allMovies.size());
    else
        if ((footer == null) && (!new_footer))
            notifyItemRemoved(allMovies.size());
        else
            if ((!new_footer) && (footer != null))
                notifyItemChanged(allMovies.size());
            
        
    
}