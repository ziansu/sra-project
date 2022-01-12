protected void newGen(int[] ind) {
    char[] child = creatures.CharCreature.cross(creatures[ind[0]], creatures[ind[1]]);
    for (int i = 0; i < (creatures.length); i++) {
        creatures[i] = new creatures.CharCreature(child);
        creatures[i].mutate(mut);
    }
}