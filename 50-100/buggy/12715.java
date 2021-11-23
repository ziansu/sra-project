public java.lang.String toString() {
    return (("Startpunt: " + (getStartPunt())) + " - Eindpunt: ") + (getEindPunt());
    java.lang.String returnString = (("Lijn: startpunt: " + (this.getStartPunt())) + " - eindpunt: ") + (this.getEindPunt());
    returnString = (returnString + "\n") + (omhullende.toString());
    return returnString;
}