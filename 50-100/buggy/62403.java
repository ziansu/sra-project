public void setCurrentIndex(int currentIndex) {
    if ((this.currentIndex) < currentIndex) {
        this.currentIndex = currentIndex;
        offset = 0;
        return ;
    }
    offset += baseOffset;
    if ((offset) >= ((marginY) - (baseOffset))) {
        offset = (marginY) - (baseOffset);
    }
}