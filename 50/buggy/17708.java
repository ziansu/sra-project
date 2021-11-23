public boolean fight(java.lang.String enemy) {
    if (((getEnergy()) < 70) && ((getEnergy()) > 30)) {
        run(dir);
        return false;
    }else {
        return true;
    }
}