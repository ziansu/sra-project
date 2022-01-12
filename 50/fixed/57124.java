@java.lang.Override
public int getCount() {
    if ((this.departures) == null) {
        return 0;
    }
    return this.departures.size();
}