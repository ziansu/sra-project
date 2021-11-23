public boolean active(boolean rs) {
    return (((mode) & 8) == 0) || (rs ^ (((mode) & 4) != 0));
}