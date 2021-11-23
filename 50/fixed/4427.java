public void remove(java.lang.Character c) {
    if (characters.contains(c)) {
        characters.remove(c);
    }
    reArrange();
}