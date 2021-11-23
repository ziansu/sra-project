@java.lang.Override
public int compareTo(fontys.time.ITime t) {
    fontys.time.Time time = ((fontys.time.Time) (t));
    return gc.compareTo(time.gc);
}