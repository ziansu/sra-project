public com.ryanpconnors.artthief.artgallery.ArtWork getTopPickArtwork() {
    java.util.List<com.ryanpconnors.artthief.artgallery.ArtWork> artWorks = new java.util.ArrayList<>();
    int stars = 5;
    while ((artWorks.isEmpty()) && (stars >= 1)) {
        artWorks = getArtWorks(stars, false);
        stars -= 1;
    } 
    if (artWorks.isEmpty()) {
        return null;
    }else {
        java.util.Collections.sort(artWorks);
        return artWorks.get(((artWorks.size()) - 1));
    }
}