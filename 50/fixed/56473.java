@java.lang.Override
public int compare(tuc.werkstatt.doubleup.Player p1, tuc.werkstatt.doubleup.Player p2) {
    if ((p1.points) < (p2.points)) {
        return 1;
    }else
        if ((p1.points) > (p2.points)) {
            return -1;
        }else {
            return 0;
        }
    
}