private void showCurrent() {
    for (java.util.Map.Entry<java.lang.Integer, java.util.ArrayList<java.lang.String>> shows : TVShows.entrySet()) {
        if (shows.getValue().get(1).equals(today)) {
            currentShows.add(shows.getValue().get(0));
            currentview.setItems(currentShows.sorted());
        }
    }
}