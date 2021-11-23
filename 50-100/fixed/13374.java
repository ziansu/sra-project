private java.lang.String getRemainder() {
    java.lang.String remainder = "";
    if ((ergebnis) != null) {
        remainder = ("+{" + (matchDataToString())) + "}";
    }
    if (((lineupHome) != null) || ((lineupAway) != null)) {
        remainder += ((("+{" + (lineupToString(lineupHome))) + "}+{") + (lineupToString(lineupAway))) + "}";
    }
    return remainder;
}