private void scrollWidthFixedWrongPosition(int position) {
    if ((isScrollNormal) != 0) {
        pageScroll((position + (isScrollNormal)));
    }else {
        pageScroll(position);
    }
}