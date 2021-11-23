private int checkLeft(int x, int y) {
    try {
        if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint((x - 1), y)).r) {
        }
    } catch (java.lang.NullPointerException n) {
        java.lang.System.out.println("Left");
        return 0;
    }
    if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint((x - 1), y)).r) {
        return 1;
    }else {
        return -1;
    }
}