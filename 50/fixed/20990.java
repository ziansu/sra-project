@java.lang.Override
public int compareTo(measure.Measurement p) {
    if (((date) != null) && ((p.date) != null)) {
        return date.compareTo(p.date);
    }
    return -1;
}