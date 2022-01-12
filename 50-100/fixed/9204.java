public java.lang.String toString() {
    java.lang.String retString = "";
    int i = 1;
    for (Destination d : this) {
        retString += ((("" + i) + ". ") + (d.toString())) + "\n";
        i++;
    }
    return retString;
}