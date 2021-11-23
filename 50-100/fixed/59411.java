public boolean addDie(int num) {
    if ((num <= 0) || (num > 6))
        return false;
    
    for (int i = 0; i < 6; i++) {
        if ((die[i]) == 0) {
            die[i] = num;
            return true;
        }
    }
    return false;
}