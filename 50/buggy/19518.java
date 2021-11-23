public void estAttaque(int force, src.Type type, src.Effet effet) {
    currHp -= force / (def);
    if ((currHp) < 1) {
        isDead = true;
        currHp = 0;
    }
}