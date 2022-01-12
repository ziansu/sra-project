public boolean pointOnSegment(Point p) {
    return (((!(p.isUnder(_poLeft))) & (!(p.isAbove(_poLeft)))) && (p.isRight(_poLeft))) && (p.isLeft(_poRight));
}