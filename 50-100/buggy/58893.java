public boolean collides(hotel.Interval other) {
    boolean caseA = (end.after(other.getBegin())) && (begin.before(other.getEnd()));
    boolean caseB = (begin.after(other.getEnd())) && (end.before(other.getBegin()));
    return caseA || caseB;
}