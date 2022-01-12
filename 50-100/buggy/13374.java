private java.lang.String getRemainder() {
    java.lang.String remainder = "";
    if ((((ergebnis) != null) || ((lineupHome) != null)) || ((lineupAway) != null)) {
        java.lang.String newRemainder = ((((("+{" + (matchDataToString())) + "}+{") + (lineupToString(lineupHome))) + "}+{") + (lineupToString(lineupAway))) + "}";
        log(newRemainder);
    }
    return remainder;
}