private int sibling(int p_currentIndex) {
    if ((parent(p_currentIndex)) == (-1)) {
        return -1;
    }else {
        if (p_currentIndex == (left(parent(p_currentIndex)))) {
            return right(parent(p_currentIndex));
        }else {
            return left(parent(p_currentIndex));
        }
    }
}