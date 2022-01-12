public java.lang.String toString() {
    java.lang.String stringversion = (((_zip) + (_checkDigit)) + " ") + (Barcode.toCode(_zip));
    return stringversion;
}