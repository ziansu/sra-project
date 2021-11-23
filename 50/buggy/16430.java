@java.lang.Override
public void loadMore(int newPageIndex) {
    pageIndex = newPageIndex;
    if ((!(isMaxPage)) && (!(isFetchingDataFromApi)))
        getRoverPhotos();
    
}