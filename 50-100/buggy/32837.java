private int calculateHP() {
    return (((((atk) & 1) << 3) + (((def) & 1) << 2)) + (((spc) & 1) << 1)) + ((spd) & 1);
}