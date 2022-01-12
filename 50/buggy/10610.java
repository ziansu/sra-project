protected void updateCurrentRecord() {
    currentRecord = getPageStartRecord();
    firePageChangeEvent(currentPage);
}