@java.lang.Override
public boolean toggleHidden() {
    isMini = readingToolbar.toggleIsMinni();
    tabBar.setHidden(isMini);
    return isMini;
}