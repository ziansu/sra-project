private void checkColidateDiagonalOther(int i) {
    if (colidate(getFields().get(i))) {
        removeRightUp((i + 1));
        removeLeftUp((i + 1));
        removeRightDown((i + 1));
        removeLeftDown((i + 1));
        setCounter(((getCounter()) - 1));
    }
}