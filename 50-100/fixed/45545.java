private boolean checkXgreaterYsmaller(int index) {
    boolean b = (((getX()) > (getxNext())) && ((getY()) < (getyNext()))) && ((index + 1) < (getFields().size()));
    return b;
}