private void scrollToChild(int position, int offset) {
    if ((tabCount) == 0) {
        return ;
    }
    int newScrollX = (container.getChildAt(position).getLeft()) + offset;
    if (newScrollX != (lastScrollX)) {
        lastScrollX = newScrollX;
        scrollTo(newScrollX, 0);
    }
}