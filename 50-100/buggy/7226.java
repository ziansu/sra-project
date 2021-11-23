@java.lang.Override
public java.lang.String toString() {
    return java.lang.String.format("%s %s %.6f %.6f %d %d %d %d %d %d %d %d", getFromId().getHeader(), getToId().getHeader(), ((1.0 - (getScore())) * 100.0), this.rawScore, (getFromId().isForward() ? 0 : 1), this.a1, this.a2, this.fromLength, (getToId().isForward() ? 0 : 1), this.b1, this.b2, this.toLength);
}