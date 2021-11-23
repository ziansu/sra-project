public void setPreviousImages(java.util.ArrayList<at.tugraz.inffeldgroup.dailypic.db.UriWrapper> prevImages, java.util.ArrayList<at.tugraz.inffeldgroup.dailypic.db.UriWrapper> nextImages) {
    nextUris = nextImages;
    nextBitmaps = new java.util.ArrayList<>();
    preloadBitmaps(nextBitmaps, nextImages);
    currentUris = previousUris;
    currentBitmaps = previousBitmaps;
    previousUris = prevImages;
    previousBitmaps = new java.util.ArrayList<>();
    preloadBitmaps(previousBitmaps, prevImages);
    notifyDataSetChanged();
}