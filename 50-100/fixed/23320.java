public void removeLiked(com.example.rvkdt.rvkapp.DataObjects.Bar bar) {
    for (int i = 0; i < (likedSize()); i++) {
        com.example.rvkdt.rvkapp.DataObjects.Bar current_bar = liked_bars.get(i);
        if (equal(bar, current_bar)) {
            liked_bars.remove(i);
        }
    }
}