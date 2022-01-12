@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == (this)) {
        return true;
    }
    if (!(o instanceof org.yccheok.jstock.engine.Board)) {
        return false;
    }
    return this.industry.equals(((org.yccheok.jstock.engine.Industry) (o)).industry);
}