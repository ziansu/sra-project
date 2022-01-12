public boolean hasNext() {
    if ((currentIndex) >= (currentResponse.getHits().getHits().length)) {
        currentResponse = client.prepareSearchScroll(currentResponse.getScrollId()).setScroll(scrollTimeout).get();
        currentIndex = 0;
    }
    return (currentResponse.getHits().getHits().length) > 0;
}