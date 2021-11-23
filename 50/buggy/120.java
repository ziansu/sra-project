@java.lang.Override
public boolean toggleHidden() {
    boolean isMini = readingToolbar.toggleIsMinni();
    tabBar.setHidden(isMini);
    return isMini;
}