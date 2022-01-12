public double GetDistanceBetweenTwoMarkers(java.lang.String sMarker1, java.lang.String sMarker2) throws java.lang.Exception {
    eng.eval((("currentPos=RBPosition(" + sMarker1) + ", Client)"));
    eng.eval((("endPos=RBPosition(" + sMarker2) + ", Client)"));
    eng.eval("Distance=sqrt(sum( (currentPos-endPos).^2))");
    double dist = eng.getVariable("Distance");
    return dist;
}