public boolean noRepeat(int num1) {
    for (int x : prevQuest) {
        if (num1 == x) {
            return true;
        }
    }
    return false;
}