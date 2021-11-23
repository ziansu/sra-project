public boolean equals(final java.lang.Object obj) {
    if (obj instanceof crustimoney.State.Step) {
        final crustimoney.State.Step other = ((crustimoney.State.Step) (obj));
        return (other.rule.equals(this.rule)) && ((other.pos) == (this.pos));
    }else {
        return false;
    }
}