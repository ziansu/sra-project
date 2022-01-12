@java.lang.Override
public void setPosition(int pos) {
    if ((size()) == 0) {
        currentIndex_ = 0;
    }
    currentIndex_ = pos % (size());
}