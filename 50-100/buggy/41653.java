public static int getCell(java.util.Calendar first) {
    int diff = sla.Tracker.daysBetweenFirstPST(first);
    boolean isFirst = diff < 7;
    if (isFirst) {
        java.lang.System.out.println("here");
        return (diff * 2) + 1;
    }else {
        java.lang.System.out.println(("vaca: " + (diff - 7)));
        java.lang.System.out.println(("boi: " + (((diff - 7) * 2) + 1)));
        return ((diff - 7) * 2) + 1;
    }
}