private boolean checkXgreaterYsmaller(int index) {
    return (((getX()) > (getxNext())) && ((getY()) < (getyNext()))) && ((index + 1) < (getFields().size()));
}