public void setOddOffset(boolean setOffset) {
    if (setOffset) {
        setLayoutY(((getLayoutY()) + (getHeight())));
    }
}