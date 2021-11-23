public void removeLike(com.tattood.tattood.Tattoo t) {
    if ((liked_view) != null)
        ((com.tattood.tattood.TattooRecyclerViewAdapter) (liked_view.getAdapter())).removeTattoo(t);
    
}