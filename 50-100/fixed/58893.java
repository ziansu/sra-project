public boolean collides(hotel.Interval other) {
    boolean caseA = ((begin.compareTo(other.getBegin())) >= 0) && ((begin.compareTo(other.getEnd())) >= 0);
    boolean caseB = ((end.compareTo(other.getBegin())) <= 0) && ((end.compareTo(other.getEnd())) <= 0);
    return !(caseA || caseB);
}