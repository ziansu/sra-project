public void generateDispText(java.lang.CharSequence c) {
    if (((currValue) == null) || ((currValue) == "0")) {
        currValue = ((java.lang.CharSequence) (c));
    }else
        if (c == "C") {
            currValue = "0";
        }else {
            currValue = (currValue.toString()) + c;
        }
    
}