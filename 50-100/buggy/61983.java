private void checkColidateDiagonal(int i) {
    if (colidate(getFields().get(i))) {
        removeRightUp(i);
        removeLeftUp(i);
        removeRightDown(i);
        removeLeftDown(i);
        setCounter(((getCounter()) - 1));
    }
}