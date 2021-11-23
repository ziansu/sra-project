public boolean addDie(int num) {
    for (int i = 0; i < 6; i++) {
        if ((die[i]) == 0) {
            die[i] = num;
            return true;
        }
    }
    return false;
}