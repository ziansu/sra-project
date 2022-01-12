public void replaceHand(Player p) {
    java.lang.String[] temp = p.getHand();
    for (int i = 0; i < (temp.length); i++) {
        tiles.add(temp[i]);
    }
    p.dealHand(tiles);
    changed = true;
}