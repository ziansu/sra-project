public void setElementLocationOnAll(java.lang.String name, film.Location location) {
    film.Scene frame;
    for (int i = 0; i < (frames.size()); i++) {
        frame = frames.get(i);
        frame.setElementPos(name, location);
    }
}