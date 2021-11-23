@java.lang.Override
public int compareTo(model.curve.Grade other) {
    if (this.overlap(other)) {
        return 0;
    }else {
        return java.lang.Double.compare(this.max, other.max);
    }
}