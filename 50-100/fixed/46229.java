public void setNumber(java.lang.String number) {
    if ((number.length()) > 7)
        number = (((((("+" + (number.charAt(0))) + " (") + (number.substring(1, 4))) + ") ") + (number.substring(4, 7))) + "-") + (number.substring(7));
    
    this.number = number;
}