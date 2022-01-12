public void toggle() {
    boolean result = true;
    if (addedToFavorites) {
        this.setBackground(icFavoriteBorder);
        if ((listener) != null)
            result = listener.removedFromFavorite();
        
        if (result)
            addedToFavorites = false;
        
    }else {
        this.setBackground(icFavorite);
        if ((listener) != null)
            result = listener.addedToFavorite();
        
        if (result)
            addedToFavorites = true;
        
    }
}