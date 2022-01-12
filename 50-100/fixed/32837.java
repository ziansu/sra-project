private int calculateHP() {
    return (((((atk) & 1) << 3) + (((def) & 1) << 2)) + (((spd) & 1) << 1)) + ((spc) & 1);
}