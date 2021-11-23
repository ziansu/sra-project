public void offsetTo(int offset) {
    if ((offset < 0) || ((getOffset()) == offset)) {
        return ;
    }
    mOffsetContainer.setTranslationY(offset);
    updateWindowBackground(offset);
}