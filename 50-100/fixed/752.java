@java.lang.Override
public int compareTo(final breakout.Score o) {
    if (((this.value) - (o.getValue())) == 0) {
        return (o.getTime()) - (this.time);
    }
    return (this.value) - (o.getValue());
}