private void checkIfHasPinnedView() {
    com.chris.recycler.collectionview.structure.SectionPath sectionPath = adapter.getSectionPath(firstPosition);
    boolean pinned = false;
    if ((sectionPath.sectionType) == (com.chris.recycler.collectionview.constants.ViewType.SECTION_HEADER)) {
        pinned = adapter.isSectionHeaderPinned(sectionPath.indexPath);
    }
    if (!pinned) {
        needOffset = (findCurrentSectionPinnedView(sectionPath)) != null;
    }
}