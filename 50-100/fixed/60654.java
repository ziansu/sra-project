@java.lang.Override
public int compare(Point o1, Point o2) {
    double s1 = this.slopeTo(o1);
    double s2 = this.slopeTo(o2);
    if (s1 < s2) {
        return -1;
    }else
        if (s1 > s2) {
            return +1;
        }else {
            return 0;
        }
    
}