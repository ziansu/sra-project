public void gainEXP(int new_exp) {
    exp += new_exp;
    if ((exp) >= (max_exp[level])) {
        if (soundOn) {
            lvUp.rewind();
            lvUp.play();
        }
        exp -= max_exp[level];
        (level)++;
        max_hp += 20;
        hp = max_hp;
        max_mp += 20;
        mp = max_mp;
        level_effect = 60;
        atk += 10;
    }
}