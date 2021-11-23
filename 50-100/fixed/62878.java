public void smoothToSectionPath(com.chris.recycler.collectionview.structure.SectionPath sectionPath) {
    int position = getScrollPosition(sectionPath);
    viewFlingingRunnable.setSmoothScroller(new com.chris.recycler.collectionview.assistant.scroll.SmoothScroller(position, sectionPath, smoothScrollerCB));
    viewFlingingRunnable.start(0, (position > (firstPosition) ? -100000 : 100000));
}