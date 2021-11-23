public void addToCircle(java.lang.Character c) {
    if (!(characters.contains(c))) {
        c.getInCircle();
        characters.add(c);
    }
}