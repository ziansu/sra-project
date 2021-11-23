public void setElementLocationOnAll(int eltIndex, film.Location location) {
    film.Scene frame;
    for (int i = 0; i < (frames.size()); i++) {
        frame = frames.get(i);
        frame.setElementPos(frame.findElement(FirstFrame.getElementAt(eltIndex)), location);
    }
}