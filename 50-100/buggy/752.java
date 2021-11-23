@java.lang.Override
public int compareTo(final breakout.Score o) {
    if (!(o instanceof breakout.Score)) {
        throw new java.lang.ClassCastException();
    }
    int anotherValue = o.getValue();
    int anotherTime = o.getTime();
    if (((this.value) - anotherValue) == 0) {
        return anotherTime - (this.time);
    }
    return (this.value) - anotherValue;
}