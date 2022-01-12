public void toggle() {
    boolean result = true;
    if (addedToFavorites) {
        if ((listener) != null)
            result = listener.removedFromFavorite();
        
        if (result) {
            addedToFavorites = false;
            this.setBackground(icFavoriteBorder);
        }
    }else {
        if ((listener) != null)
            result = listener.addedToFavorite();
        
        if (result) {
            addedToFavorites = true;
            this.setBackground(icFavorite);
        }
    }
}