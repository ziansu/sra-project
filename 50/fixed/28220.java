public int getFirstPinCount() {
    if ((getPins().size()) == 0) {
        return 0;
    }
    return getPins().get(0).getCount();
}