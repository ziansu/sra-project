private int checkDown(int x, int y) {
    try {
        if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint(x, (y - 1))).u) {
        }
    } catch (java.lang.NullPointerException n) {
        java.lang.System.out.println("Down");
        return 0;
    }
    if (rooms.get(new com.tda367.infinityrun.Roomtemplates.IndexPoint(x, (y - 1))).u) {
        return 1;
    }else {
        return -1;
    }
}