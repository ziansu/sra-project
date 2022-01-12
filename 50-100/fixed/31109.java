private int checkUp(int x, int y) {
    try {
        if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint(x, (y + 1))).d) {
        }
    } catch (java.lang.NullPointerException n) {
        return 0;
    }
    if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint(x, (y + 1))).d) {
        return 1;
    }else {
        return -1;
    }
}