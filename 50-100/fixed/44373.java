private int checkRight(int x, int y) {
    try {
        if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint((x + 1), y)).l) {
        }
    } catch (java.lang.NullPointerException n) {
        return 0;
    }
    if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint((x + 1), y)).l) {
        return 1;
    }else {
        return -1;
    }
}