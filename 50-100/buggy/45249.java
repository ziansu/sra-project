@java.lang.Override
public int compareTo(wslf.geometry.Point p) {
    if (equals(p)) {
        return 0;
    }
    if (((x) < (p.x)) || (((java.lang.Math.abs(((x) - (p.x)))) < (EPS)) && ((y) < (p.x)))) {
        return -1;
    }
    return 1;
}