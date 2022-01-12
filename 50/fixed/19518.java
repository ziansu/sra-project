public void estAttaque(int force, src.Type type) {
    currHp -= force / (def);
    if ((currHp) < 1) {
        isDead = true;
        currHp = 0;
    }
}