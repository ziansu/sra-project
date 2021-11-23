public Frame updatePage(java.lang.String newContents) {
    _pageContents.append(((java.lang.System.lineSeparator()) + newContents));
    setDirty(true);
    return this;
}