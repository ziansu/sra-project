public <T> T getByIndex(int keyIndex) {
    return castType(super.get(getKey(keyIndex)));
}