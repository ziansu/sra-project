public void bind(com.lcanaveral.movile.traktapp.ui.episodes.Episode episode) {
    title.setText(episode.title);
    number.setText(("E" + (episode.number)));
}