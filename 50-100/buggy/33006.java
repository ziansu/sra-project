public void setPreviousImages(java.util.ArrayList<at.tugraz.inffeldgroup.dailypic.db.UriWrapper> prevImages, java.util.ArrayList<at.tugraz.inffeldgroup.dailypic.db.UriWrapper> nextImages) {
    nextBitmaps = new java.util.ArrayList<>();
    preloadBitmaps(nextBitmaps, nextImages);
    nextUris = nextImages;
    currentBitmaps = previousBitmaps;
    currentUris = previousUris;
    previousBitmaps = new java.util.ArrayList<>();
    preloadBitmaps(previousBitmaps, prevImages);
    previousUris = prevImages;
    notifyDataSetChanged();
}