public void setFacsimile(zemfi.de.vertaktoid.Facsimile facsimile) {
    this.document = facsimile;
    pageNumber.set(0);
    currentMovementNumber = (document.movements.size()) - 1;
    setImage(findImageForPage(0));
    maxPageNumber.set(document.pages.size());
    currentPath.set(document.dir.getPath());
    horOverlapping = 0;
}