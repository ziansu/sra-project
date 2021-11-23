public void gain_hp(int gnhp) {
    hp += gnhp;
    hp = java.lang.Math.min(hp, max_hp);
}