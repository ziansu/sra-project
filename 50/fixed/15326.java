public Frame updatePage(java.lang.String newContents) {
    _pageContents.append(java.lang.System.lineSeparator());
    _pageContents.append(newContents);
    setDirty(true);
    return this;
}