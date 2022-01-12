boolean isBuilding(int tile) {
    if ((tile > 64) && (tile < 208)) {
        return true;
    }
    if ((tile > 223) && (tile < 828)) {
        return true;
    }
    if ((tile > 831) && (tile < 948)) {
        return true;
    }
    return false;
}