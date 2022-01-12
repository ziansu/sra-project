public void addEpisode(int season, int episode, java.lang.String title, java.lang.String publishDate) {
    while ((seasons.size()) < (season - 1)) {
        seasons.add(new me.dilek.izlek.domain.Season(((seasons.size()) + 1)));
    } 
    me.dilek.izlek.domain.Season s = seasons.get((season - 1));
    s.addEpisode(episode, title, publishDate);
}