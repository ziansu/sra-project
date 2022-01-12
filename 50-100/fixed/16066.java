protected void creaMano() {
    for (int i = 0; i < 1; i++) {
        mano.add(mazzo.get(((mazzo.size()) - 1)));
        mazzo.remove(((mazzo.size()) - 1));
    }
}